package com.tekworks.day_3;

import java.util.HashSet;
import java.util.Set;

public class FindThePrefixCommonArrayOfTwoArrays {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int c[] = new int[A.length];
        for(int i=0 ; i<A.length ; i++) {
            c[i] = commonElements(A,B,i);
        }
        return c;
    }

    public int commonElements(int[] a, int[] b, int len) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        for(int i=0 ; i<=len ; i++) {
            setA.add(a[i]);
            setB.add(b[i]);
        }
        setA.retainAll(setB);
        return setA.size();
    }
}