package com.rays.collection.streamapi;

import java.util.Arrays;
import java.util.List;


public class OddEven {
	
	public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,8,99,4);
        list.stream().distinct().forEach(e -> {
            if(e % 2 == 0){
                System.out.println(e + " Even");
            }else {
                System.out.println(e + " Odd");
            }
        });
    }

}
