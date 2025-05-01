package com.kh.demo.domain.product.svc;

import com.kh.demo.domain.entity.Product;
import com.kh.demo.domain.product.dao.ProductDAO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j  //로그 출력할 일 있으면
@Service
@RequiredArgsConstructor
public class ProductSVCImpl implements ProductSVC{ //빠른 수정 : 알트 엔터, 컨트롤 아이

  final private ProductDAO productDAO;

//  public ProductSVCImpl(ProductDAO productDAO) {
//    this.productDAO = productDAO;
//  }

  @Override
  public List<Product> findAll() {
    return productDAO.findAll();
  }
}
