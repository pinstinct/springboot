package com.limhm.springboot.service;

import com.limhm.springboot.dto.PaymentDto.PaymentOrderReq;
import com.limhm.springboot.factory.InicisPgOrder;
import com.limhm.springboot.factory.KgMobiliansPgOrder;
import com.limhm.springboot.factory.NPayPgOrder;
import java.util.HashMap;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PaymentService {

  public HashMap<String, Object> orderPayment(PaymentOrderReq req) {
    HashMap<String, Object> result = new HashMap<>();
    String payWay = req.getPayWay();
    switch (payWay) {
      case "CARD":
      case "BANK":
      case "VIRTUAL":
      case "PAYCO":
        result = new InicisPgOrder().payment(req);
        break;
      case "MOBILE":
        result = new KgMobiliansPgOrder().payment(req);
        break;
      case "NPAY":
        result = new NPayPgOrder().payment(req);
        break;
    }
    return result;
  }

}
