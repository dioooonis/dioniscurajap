package com.java.project.Project;

import lombok.extern.slf4j.Slf4j;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;


import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j//for the LOGGER
@TestInstance(Lifecycle.PER_CLASS)        
        
class EcommerceTests {

}
