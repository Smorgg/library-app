package com.group.libraryapp.controller;

import com.group.libraryapp.dto.calculator.request.CalculatorAddRequest;
import com.group.libraryapp.dto.calculator.request.CalculatorMultiplyRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//API를 개발하려는 클래스 가장 위에는 @RestController를 넣어줘야 함. 이 클래스를 API의 진입 지점으로 만들어 줌 API가 이 클래스 안의 Method를 사용가능하게 함
@RestController
public class CalculatorController {

    @GetMapping("/add") //GET /add
    //쿼리를 통해 받은 데이터를 함수에 연결해줄 때는 @RequestParam을 붙여주어야 함
    public int addTwoNumbers(CalculatorAddRequest request){
        return request.getNumber1() + request.getNumber2();
    }

    @PostMapping("/multiply") //POST /multiply
    public int multiplyTwoNumbers(@RequestBody CalculatorMultiplyRequest request) {
        return request.getNumber1() * request.getNumber2();

    }
}
