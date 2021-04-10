package spring.controller.domain.post;

import lombok.Getter;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity // JPA DB 클래스 (하나의 테이블)
@Getter // get메소드
@NoArgsConstructor // 빈 생성자
//@RequiredArgsConstructor // 생성자 자동생성
public class Posts { // DB 테이블 설계
    
    // JPA

    @Id // 기본키(PK)
    @GeneratedValue (strategy = GenerationType.IDENTITY) // 오토키(AI)
    private Long id; // 게시물 번호

    @Column (length = 500, nullable = false) // varchar(기본값), not null
    private String title; // 게시물 제목

    @Column (columnDefinition = "TEXT", nullable = false)
    private String content; // 게시물 내용
    
    private String author; // 게시물 작성자

    // 생성자
    @Builder // 생성자 안정성 보장 : 1. JPA 인수 순서 구분 안함  2. NULL값 자동제한 등
    public Posts (String title, String content, String author){

        this.title = title;
        this.content = content;
        this.author = author;
    }
}
