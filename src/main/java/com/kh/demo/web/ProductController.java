package com.kh.demo.web;

import com.kh.demo.domain.entity.Product;
import com.kh.demo.domain.product.svc.ProductSVC;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/products") //url경로
@RequiredArgsConstructor



public class ProductController {

  final private ProductSVC productSVC;

  //목록
  @GetMapping       // GET http://localhost:9080/products 뭔가를 조회
  public String findAll(Model model) {
    List<Product> list = productSVC.findAll();
    model.addAttribute("list", list);
    return "product/all"; //view의 경로
  }

  //상품등록-화면
  @GetMapping       // GET http://localhost:9080/products/add
  public String addForm() {
    return "product/add"; //view 응답메시지 바디에 담아서 뷰에 보내줌(상품등록 화면으로 응답을 할거야)
  }

  //상품등록-처리
  @PostMapping      // POST  http://localhost:9080/products/add
  public String add() {


    return "redirect:/products/{id}";
  }



  // view 안만들어주고 그냥 데이터만 전달할 수 있음
  @ResponseBody // 이걸 붙이면 아래 메소드의 return값인 "test1"을 웹 페이지 바디에 그대로 응답하게 된다.
  @GetMapping("/test1")   // GET http:localhost:9080/products/test1
  public String test1() {
    return "test1";
  }

}
