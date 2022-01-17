package com.limhm.springboot.factory;

import com.limhm.springboot.pg.Inicis;
import com.limhm.springboot.pg.Pg;

public class InicisPgOrder extends PgOrder {

  @Override
  public Pg createPg() {
    return new Inicis();
  }

}
