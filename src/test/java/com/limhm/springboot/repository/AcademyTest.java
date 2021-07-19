package com.limhm.springboot.repository;

import com.limhm.springboot.domain.Academy;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class AcademyTest {

    @Autowired
    private AcademyRepository academyRepository;

    @AfterEach
    public void tearDown() throws Exception {
        academyRepository.deleteAllInBatch();
    }

    @Test
    public void querydsl_기본_기능_확인() {
        String name = "steve";
        String address = "steve@abc.com";
        academyRepository.save(new Academy(name, address));

        List<Academy> result = academyRepository.findByName(name);

        assertThat(result.size()).isEqualTo(1);
        assertThat(result.get(0).getAddress()).isEqualTo(address);
    }
}
