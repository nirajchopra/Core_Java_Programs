package com.rays.collection.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestent {

	public static void main(String[] args) {

		//   Contestent objects ki list banayi
		List<Contestent> list = new ArrayList<>();

		//   Dummy contestant data add kiya (name + phone number)
		list.add(new Contestent("Niraj", "8305443480"));
		list.add(new Contestent("Himanshu", "9340309847"));
		list.add(new Contestent("Lucky", "6263272128"));
		list.add(new Contestent("Dau", "9985648726"));
		list.add(new Contestent("Nikunj", "45635424545")); // invalid phone (length > 10)
		list.add(new Contestent("Lallu", "466482466"));    // invalid phone (length < 10)
		list.add(new Contestent("Deepak", "465215"));      // invalid phone (length < 10)

		//   Stream pipeline start
		list.stream()
		
			//   Har Contestent object se sirf phone number nikaala
			.map(e -> e.phone)
			
			//   Sirf un phones ko liya jinki length 10 hai (valid mobile numbers)
			.filter(e -> e.length() == 10)
			
			//   Agar koi duplicate phone hai to hata diya
			.distinct()
			
			//   Collect kara list me aur fir us list ko shuffle (randomize) kara
			.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
				
				//   List ko random shuffle kar diya
				Collections.shuffle(e);
				
				//   Wapas stream banayi taaki limit aur forEach use kar sake
				return e.stream();
			}))
			
			//   Sirf 3 random phone numbers pick karo
			.limit(3)
			
			//   Har selected phone number ko print karo
			.forEach(e -> {
				System.out.println(e);
			});
	}
}
