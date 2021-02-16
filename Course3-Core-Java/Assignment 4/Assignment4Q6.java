package com.company;

import java.util.List;
import java.util.function.UnaryOperator;

public class Assignment4Q6 {
    public static void main(String[] args) {}
    public List<String> convertToUpperCase(List<String> list) {
        list.replaceAll(new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        });
        return list;
    }
}