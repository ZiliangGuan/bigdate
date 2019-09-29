package in.iask.pluto.bigdate.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "in.iask.pluto.bigdate.user.mapper")
public class BigdateUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BigdateUserServiceApplication.class, args);
    }

}
