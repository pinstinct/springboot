package com.limhm.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class PaymentDto {

  @Builder
  @Getter
  @NoArgsConstructor
  @AllArgsConstructor
  public static class PaymentOrderReq {
    String payWay;
  }

}
