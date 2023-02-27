package com.example.mylibrary.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class SecondService {

    public String connectByParam(String param){
        log.info("Connection: {}", param);
        return param;
    }
}
