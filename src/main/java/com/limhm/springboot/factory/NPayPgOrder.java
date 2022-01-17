package com.limhm.springboot.factory;

import com.limhm.springboot.pg.NPay;
import com.limhm.springboot.pg.Pg;

public class NPayPgOrder extends PgOrder {

  @Override
  public Pg createPg() {
    return new NPay();
  }

}
