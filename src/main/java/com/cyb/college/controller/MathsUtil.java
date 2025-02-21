package com.cyb.college.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.xmlbeans.impl.common.SystemCache;

public class MathsUtil {
    static List<Integer> ops = new ArrayList<>();
    
    public static void main(String[] args) {
        sum();
        substract();
        mutiply();
        for (Integer nums : ops) {
            System.out.println("First Commit");
            System.out.println("Sec Commit");
            System.out.println("Third Commit");
            System.out.println("Fourth Commit");
            
        }
    }
    
    public static void sum() {
        ops.add(2 + 2);
    }
    
    public static void substract() {
        ops.add(4 + 5);
    }
    
    public static void mutiply() {
        ops.add(3 * 3);
    }
}
