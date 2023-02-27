package com.example.mylibrary.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReplaceableService {

    private final SecondService secondService;

    public String questionableMethod() {
        return secondService.connectByParam(badMethod());
    }

    private String badMethod() {
        return "Bad connection";
    }

}
