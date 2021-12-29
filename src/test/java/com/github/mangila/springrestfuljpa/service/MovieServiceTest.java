package com.github.mangila.springrestfuljpa.service;

import com.github.mangila.springrestfuljpa.ReusableMySQLContainer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MovieServiceTest extends ReusableMySQLContainer {

    @Autowired
    private MovieService service;

    @Test
    void test() {
        assertThat(service.findAll()).isEmpty();
    }

}