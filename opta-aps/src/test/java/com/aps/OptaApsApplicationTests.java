package com.aps;

import com.aps.application.ProductMaterialApplicationService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.inject.Inject;

@SpringBootTest
class OptaApsApplicationTests {

    @Inject
    private ProductMaterialApplicationService service;

    @Test
    void contextLoads() {
        System.out.println(service.getAll());
    }

}
