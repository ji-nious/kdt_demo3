package com.kh.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/products") //url경로
public class ProductController {
  //목록
  @GetMapping       // GET http://localhost:9080/products
  public String findAll() {

    return "product/all"; //view의 경로
  }


  // view 안만들어주고 그냥 데이터만 전달할 수 있음
  @ResponseBody // 이걸 붙이면 아래 메소드의 return값인 "test1"을 웹 페이지 바디에 그대로 응답하게 된다.
  @GetMapping("/test1")   // GET http:localhost:9080/products/test1
  public String test1() {
    return "test1";
  }

}
