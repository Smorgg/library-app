package com.group.libraryapp.domain.book;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;

    // 원래는 @Column(nullable = false, length = 255, name = "name")이지만
    // 테이블의 사양을 255로 맞추었고 필드의 이름과 테이블에 필드의 이름이 같으면 생략가능
    @Column(nullable = false)
    private  String name = null;

    // JPA에서 필요한 기본 생성자
    protected Book() {}

    // id는 자동생성이기 때문에 이름을 받는 생성자를 만들어준다
    public Book(String name) {
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException(String.format("잘못된 name(%s)이 들어왔습니다", name));
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
