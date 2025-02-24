package com.dmr.test01;

import java.util.ArrayList;
import java.util.List;

public class Genericity {
    public static void main(String[] args) {
        //泛型：ArrayList<T>
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        System.out.println(list);
    }
}
