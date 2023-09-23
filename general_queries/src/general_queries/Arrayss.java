package general_queries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Arrayss {

	public static void main(String[] args) {
	int num=123987;
	int n=0;
	int find=8; 
	//int arr[] = new int [5] ;
	List numbers= new ArrayList<>();
	while(num!=0) {
		n=num%10;
		numbers.add(n);
		//System.out.println(n);
		num/=10;
	}
	numbers.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
// numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
//	Object x=numbers.stream().sorted(Collections.reverseOrder()).distinct().limit(1).skip(0).findFirst().get();
  //  numbers.forEach(System.out::println);
    int index=numbers.indexOf(find);
    System.out.println(index);
	}

}
