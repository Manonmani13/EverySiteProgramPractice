package com.design.pattern.design_pattern.BehaviroalPattern.Iterator;

import java.util.Iterator;
import java.util.List;

public class MyCollection {

    List<String> items =List.of("Item1", "Item2", "Item3");
    Iterator<String> iterator() {
        return items.iterator();
    }
    
}
