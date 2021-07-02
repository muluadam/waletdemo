package com.cloud.waletdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test2")
    public String testTwo(){
        return "Test Two after push  three to from github ";
    }
}
