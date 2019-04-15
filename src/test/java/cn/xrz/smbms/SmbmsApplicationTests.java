package cn.xrz.smbms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.time.LocalDate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmbmsApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Test
    public void contextLoads() {
        //测试链接对象
        try {
            System.out.println(dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test_0(){
        System.out.println(LocalDate.now().getYear());
    }

}
