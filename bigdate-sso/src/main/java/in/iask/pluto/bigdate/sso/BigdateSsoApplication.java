package in.iask.pluto.bigdate.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "in.iask.pluto.bigdate.sso.mapper")
public class BigdateSsoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BigdateSsoApplication.class, args);
    }

}
