package com.example.mylibrary.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FirstService {

    private final ReplaceableService replaceableService;
    private final ReplaceableServiceFinal replaceableServiceFinal;

    public String callQuestionableMethod() {
        return replaceableService.questionableMethod();
    }

    public String callQuestionableMethodFinal(){
        return replaceableServiceFinal.questionableMethod();
    }

}
