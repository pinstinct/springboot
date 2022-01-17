package com.limhm.springboot.factory;

import com.limhm.springboot.pg.KgMobilians;
import com.limhm.springboot.pg.Pg;

public class KgMobiliansPgOrder extends PgOrder {

  @Override
  public Pg createPg() {
    return new KgMobilians();
  }

}
