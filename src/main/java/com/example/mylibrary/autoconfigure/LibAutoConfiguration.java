package com.example.mylibrary.autoconfigure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.mylibrary.service")
public class LibAutoConfiguration {

}
