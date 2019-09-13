package in.iask.pluto.bigdate.sso;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "in.iask.pluto.bigdate.sso.mapper")
public class BigdateSsoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BigdateSsoApplication.class, args);
    }

}
