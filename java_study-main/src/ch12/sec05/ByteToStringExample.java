package ch12.sec05;

import java.util.Arrays;

public class ByteToStringExample {
    public static void main(String[] args) {
        String data="자바";
        //String=>Byte배열
        byte[]arr1=data.getBytes();
        System.out.println(Arrays.toString(arr1));

        //Byte배열 => String
        String str1=new String(arr1);
        System.out.println(str1);
    }
}
