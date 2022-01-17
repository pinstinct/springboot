package com.limhm.springboot.controller;

import com.limhm.springboot.dto.PaymentDto.PaymentOrderReq;
import com.limhm.springboot.service.PaymentService;
import java.util.HashMap;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PaymentController {
  private final PaymentService paymentService;

  @PostMapping("/payment")
  public HashMap<String, Object> paymentOrder(@RequestBody PaymentOrderReq req) {
    return paymentService.orderPayment(req);
  }

}
