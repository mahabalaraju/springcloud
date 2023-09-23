package com.raj.microservices;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitterReturnValueHandler;

public class flatmap  {
	public static void main(String[] args) {
	List<person> ga=	Optional.ofNullable( repository.getall()).orElse(null);
	Optional<Object> empt= Optional.empty();
	System.out.println(empt);
	//long a=	ga.stream().count();
	//System.out.println(ga.size());
	//getall.forEach(System.out::println);
		//getall.stream().filter(t->t.getEmail().startsWith("ra")).forEach(System.out::println);
	  // List geta= getall.stream().filter(emp-> emp.getSalary()>50000).collect(Collectors.toList());
		//geta.forEach(System.out::println);
	//	List<person> g=getall.stream().sorted(Comparator.comparing(person::getSalary).reversed()).collect(Collectors.toList());
	//	g.stream().forEach(System.out::println);
		//forEach(System.out::println);
	Consumer<Integer>  consumer= (t)->{
		System.out.println("hi");
	};
	Predicate<Integer> predicate = t->t%2==0;
	Supplier<Integer> supplier= ()->{
		return 1;
	};
	System.out.println(predicate.test(1));
	consumer.accept(1);
	System.out.println(supplier.get());
}}
