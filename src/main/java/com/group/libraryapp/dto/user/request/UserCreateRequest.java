package com.group.libraryapp.dto.user.request;

public class UserCreateRequest {

    private String name;
    private Integer age; // null이 가능하도록 그냥 int는 null을 표현하지 못 함

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
