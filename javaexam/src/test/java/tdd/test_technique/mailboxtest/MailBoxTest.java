package tdd.test_technique.mailboxtest;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class MailBoxTest {
    @Test
    public void newMailBox_should_empty() {
        MailBox mailBox = new MailBox();
        assertThat(mailBox.messageCount() ,is(0));
    }
}
