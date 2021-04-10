package spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // JSON 반환하는 컨트롤러로 사용
public class HelloController {

    @GetMapping("/hello") // 해당 메소드를 HTTP GET 요청을 받을 수 있는 어노테이션
    public String hello() {
        return "스프링부트 입니다.";

    }

}
