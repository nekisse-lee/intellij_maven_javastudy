package com.nekisse.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import javax.sql.DataSource;
import java.sql.Connection;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration("classpath:root-context.xml")
public class DataSourceTest {

    @Inject
    private DataSource ds;

    @Test
    public void testConnection()throws Exception{

        try(Connection con = ds.getConnection()){

            System.out.println(con);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}


