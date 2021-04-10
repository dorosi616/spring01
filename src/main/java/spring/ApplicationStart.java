package spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 해당 클래스를 스프링부트 사용 선언
public class ApplicationStart {

    public static void main(String[] args) {

        SpringApplication.run(ApplicationStart.class, args);

    }

}
