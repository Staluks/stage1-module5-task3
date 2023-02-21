package com.epam.mjc;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
       return list.stream().filter(x -> x%2 ==0).collect(Collectors.toList());
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream().map(st->st.toUpperCase()).collect(Collectors.toList());
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return list.stream().max((x,y) -> x.compareTo(y));
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return list.stream().flatMap(x->x.stream()).min((x,y)->x.compareTo(y));
    }

    public Integer sum(List<Integer> list) {
        return list.stream().reduce(0, (x,y)->x+y);
    }
}
