package com.limhm.springboot.factory;

import com.limhm.springboot.dto.PaymentDto.PaymentOrderReq;
import com.limhm.springboot.pg.Pg;
import java.util.HashMap;

public abstract class PgOrder {

  public HashMap<String, Object> payment(PaymentOrderReq req) {
    HashMap<String, Object> result = new HashMap<>();

    try {
      /*
       * 공통 로직 (데이터 가공, DB 저장 및 비지니스 로직)
       * */

      Pg pg = createPg();
      HashMap<String, Object> requestData = pg.requestData();
      result.put("result", requestData);
    } catch (Exception e) {
      result.put("result", "fail");
    }
    return result;
  }

  /*
  * PG사 별로 다른 처리가 필요한 경우 아래에 추상 함수를 추가
  * */
  public abstract Pg createPg();

}
