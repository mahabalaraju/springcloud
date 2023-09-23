package com.raj.microservices;

import java.nio.MappedByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Vector;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

public class map {
static Map<Integer, String> mapp= new HashMap<>();

public static void main(String[] args) {
	

	//mapp.put(1, null);
//mapp.put(3, null);
	//mapp.put(null, "asdf");
//	mapp.put(null, null);
	mapp.put(2, "as");
	mapp.put(6, "asf");
	//mapp.put(null, "asdfas");
	//System.out.println(mapp);
	//mapp.forEach((key,value)-> System.out.println(key+"  "+value));
	//mapp.entrySet().stream().forEach(obj-> System.out.println(obj));
	//mapp.entrySet().stream().filter(k->k.getKey().equals(Optional.ofNullable(2))).forEach(System.out::println);
    mapp.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(t->System.out.println(t));
List<Integer> list= Arrays.asList(1,1,2,2,1,1,11,1,1,1,1,1,11,1,1,1,1);
//List<Integer> sum= //list.stream().mapToInt(e->e).reduce(0, null)
//list.stream().reduce(Integer::sum).get();
//list.stream().reduce( (a,b)->a+b).get();
//list.stream().reduce(Integer.MIN_VALUE, (acc, num) -> Integer.max(acc, num));
//list.stream().reduce(Integer::max).get();

//list.stream().filter(e->Collections.frequency(list, list)>1).collect(Collectors.toList());
//    System.out.println("Max: " + sum);
//

//int min = list.stream().reduce(Integer.MAX_VALUE,(acc,num)-> Integer.min(acc, num));
//list.stream().reduce(Integer.MIN_VALUE,(a,b)-> Integer.min(a, b));
//System.out.println("min value:"+ min);
//Set<Integer> set= new HashSet<>() ;
List<Integer> dupList= //list.stream().filter(e->!set.add(e)).collect(Collectors.toList());
list.stream().filter(e->Collections.frequency(list, e)>1).collect(Collectors.toList());
System.out.println(dupList);
}
}
