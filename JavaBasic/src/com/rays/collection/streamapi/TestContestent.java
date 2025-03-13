package com.rays.collection.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.rays.collection.Collections;

public class TestContestent {
	
	public static void main(String[] args) {
		
		List<Contestent> list = new ArrayList<>();
		
		list.add(new Contestent("Niraj", "8305443480"));
		list.add(new Contestent("Himanshu", "9340309847"));
		list.add(new Contestent("Lucky", "6263272128"));
		list.add(new Contestent("Dau", "9985648726"));
		list.add(new Contestent("Nikunj", "45635424545"));
		list.add(new Contestent("Lallu", "466482466"));
		list.add(new Contestent("Deepak", "465215"));
		
		list.stream()
		.map(e -> e.phone)
		.filter(e -> e.length()==10)
		.distinct()
		.collect(Collectors.collectingAndThen(Collectors.toList(),e -> { Collections.shuffle(e);
		return e.stream();
		})).limit(3).forEach(e -> {System.out.println(e);
		
		});
	}

}
