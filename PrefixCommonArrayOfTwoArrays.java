package com.tekworks.day_3;

import java.util.HashSet;
import java.util.Set;
//2657. Find the Prefix Common Array of Two Arrays
public class PrefixCommonArrayOfTwoArrays {
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

/*
class Solution {
    public int[] findThePrefixCommonArray(int[] a, int[] b) {
        int c[] = new int[a.length];
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        for(int i=0 ; i<a.length ; i++) {
            for(int j=0 ; j<=i ; j++) {
                setA.add(a[j]);
                setB.add(b[j]);
            }
            setA.retainAll(setB);
            c[i] =  setA.size();
            setA.clear();
            setB.clear();
        }
        return c;
    }
        
}
*/