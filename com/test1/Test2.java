package com.test1;

import java.io.Serializable;
import java.util.HashMap;

public class Test2 implements Cloneable, Serializable {
    final HashMap<String, Integer> hashMap = new HashMap();

    Test2() {
        hashMap.put("A", 1);
        hashMap.put("B", 2);

    }

    public static void main(String[] args) {

        HashMap<String, Integer> hashMap1 = new HashMap();
        Test2 test2 = new Test2();

    }
}
