package com.holovenko.springpatterns.console;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class Printer {

    public void separateBlock() {
        System.out.println();
    }

    public void print(String text) {
        System.out.println(text);
    }

    public void printList(List<String> list) {
        list.forEach(System.out::println);
    }
}
