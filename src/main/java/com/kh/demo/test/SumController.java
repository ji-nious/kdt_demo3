package com.kh.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SumController {

  @GetMapping("/sum") //  요청 url      http://localhost:9080/sum
  public String calculateSum(Model model){
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
      sum += i;
    }
    model.addAttribute("result", sum);  //result : 타임리프 파일에서 ${}에 넣어두었던 값.
    return "test/view_sum"; // view 위치
  }
}
