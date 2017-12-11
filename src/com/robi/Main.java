package com.robi;

import java.util.*;

public class Main {
   public static void main(String args[]) {
       int number =23;
       List<Integer> list =middleSquareNumber(7182);
       for (int x: list){
           //System.out.println(x);
       }
   }
    static List<Integer> middleSquareNumber(int number) {

        List<Integer> list = new ArrayList<>();

        int midNumber = number;

        while (midNumber!=0){
            System.out.println(midNumber);
            list.add(midNumber);

            midNumber = Integer.parseInt(String.format("%0"+2*String.valueOf(number).length()+"d", midNumber*midNumber).substring(2,6)) ;
        }
        return list ;
    }
}


