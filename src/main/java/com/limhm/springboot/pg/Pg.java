package com.limhm.springboot.pg;

import java.util.HashMap;

public interface Pg {
  HashMap<String, Object> requestData(); // PG사 별 데이터 세팅 함수

  HashMap<String, Object> responseData();  // PG사 통신 후 응답 데이터 처리 함수
}
