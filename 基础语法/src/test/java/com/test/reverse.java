package com.test;

import java.util.HashMap;

public class reverse {
    public static  void main(String[] args) {
       /*字符串反转
        int x=121;
        String a=(new StringBuilder(x+"")).reverse().toString();
        */
        String str = "abcaaaefdabbhg";
        int x=0;
        char[] chars=str.toCharArray();
        HashMap<Character, Integer> hashMap=new HashMap<>();
        for(char key:chars){
            if(!hashMap.containsKey(key))
                hashMap.put(key,1);
            else
                hashMap.put(key,hashMap.get(key)+1);
        }
        System.out.println(hashMap);
    }

}
