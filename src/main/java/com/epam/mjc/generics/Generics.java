package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public <T extends Object> List<T> boxingMethod(T name) {
        List<T> firstList = new ArrayList<T>();
        firstList.add(name);
        List<T> secondList = new ArrayList<T>();
        secondList.add(name);
        return secondList;
    }

    public <T extends Object> T genericMethod(T data) {
        return data;
    }

    public <T extends Object> void cloneMethod(List<T> consumer, List<? extends T> producer) {
        consumer.addAll(producer);
    }

}
