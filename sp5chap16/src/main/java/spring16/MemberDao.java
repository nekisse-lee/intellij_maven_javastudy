package spring16;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

public class MemberDao {

  private JdbcTemplate jdbcTemplate;

  public MemberDao(DataSource dataSource) {
    this.jdbcTemplate = new JdbcTemplate(dataSource);
  }

  private RowMapper<Member> memRowMapper() {
    return new RowMapper<Member>() {
      @Override
      public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
        Member member = new Member(
            rs.getString("EMAIL"),
            rs.getString("PASSWORD"),
            rs.getString("NAME"),
            rs.getTimestamp("REGDATE").toLocalDateTime());
        member.setId(rs.getLong("ID"));
        return member;
      }
    };
  }

  public Member selectByEmail(String email) {
    List<Member> results = jdbcTemplate.query(
        "SELECT * FROM member WHERE email = ?",
        memRowMapper(), email);

    return results.isEmpty() ? null : results.get(0);
  }


  public void insert(Member member) {
    KeyHolder keyHolder = new GeneratedKeyHolder();
    jdbcTemplate.update(new PreparedStatementCreator() {
      @Override
      public PreparedStatement createPreparedStatement(Connection con)
          throws SQLException {
        // 파라미터로 전달받은 Connection을 이용해서 PreparedStatement 생성
        PreparedStatement pstmt = con.prepareStatement(
            "INSERT INTO member (email, password, name, regdate) " +
                "VALUES (?, ?, ?, ?)",
            new String[]{"ID"});
        // 인덱스 파라미터 값 설정
        pstmt.setString(1, member.getEmail());
        pstmt.setString(2, member.getPassword());
        pstmt.setString(3, member.getName());
        pstmt.setTimestamp(4,
            Timestamp.valueOf(member.getRegisterDateTime()));
        // 생성한 PreparedStatement 객체 리턴
        return pstmt;
      }
    }, keyHolder);
    Number keyValue = keyHolder.getKey();
    member.setId(keyValue.longValue());
  }

  public void update(Member member) {
    jdbcTemplate.update(
        "UPDATE member SET name = ?, password = ? WHERE email = ?",
        member.getName(), member.getPassword(), member.getEmail());
  }

  public int count() {
    Integer count = jdbcTemplate.queryForObject(
        "SELECT count(*) FROM member", Integer.class);
    return count;
  }

  public List<Member> selectAll() {
    List<Member> results = jdbcTemplate.query("SELECT * FROM member",
        memRowMapper());
    return results;
  }

  public List<Member> selectByRegdate(
      LocalDateTime from, LocalDateTime to) {
    List<Member> resutls = jdbcTemplate.query(
        "SELECT * FROM member WHERE regdate BETWEEN ? AND ? " +
            "ORDER BY regdate DESC",
        memRowMapper(),
        from, to);
    return resutls;
  }


  public Member selectById(Long memId) {
    List<Member> results = jdbcTemplate.query(
        "SELECT * FROM member WHERE id = ? ",
        memRowMapper(), memId);
    return results.isEmpty() ? null : results.get(0);
  }

}
