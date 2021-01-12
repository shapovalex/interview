package com.example.task4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationController {

    private int counter = 0;

    @GetMapping("/operation")
    public synchronized String doOperation() {
        counter++;
        return "OK";
    }

    @GetMapping("/count")
    public Integer getCount() {
        return counter;
    }
}
