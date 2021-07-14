package com.limhm.springboot.mapper;

import com.limhm.springboot.domain.Car;
import com.limhm.springboot.dto.CarDto;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class shouldMapCarToDto {
    Car car = new Car("Tesla", 5, "SEDAN");
    CarDto carDto = CarMapper.INSTANCE.catToCarDto(car);

    @Test
    public void mapping(){
        assertThat(carDto).isNotNull();
        assertThat(carDto.getMake()).isEqualTo("Tesla");
        assertThat(carDto.getSeatCount()).isEqualTo(5);
        assertThat(carDto.getType()).isEqualTo("SEDAN");
    }
}
