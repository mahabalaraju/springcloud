package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
//import java.util.en;
import java.util.Random;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class sdfasaa {
	public static void main(String[] args) {
//		TreeSet<Integer> a2= new TreeSet<>();
//		//a2.add(null);
//		//a2.add(null);
//		int a=10, b=20;
////		int c= ++a-a--+b++ -b+b++-b++;
////		System.out.println(c);
////		int d= b>>1;
////		System.out.println(d);
//		  int myOct = 0x23fdaaeA;
//		  int mydeci=0b1010;
//	      System.out.println(mydeci);
//		int x=90;
// long l= x;
// double d= (double)l;
//	}
//		String str= "INdia is mycountry";
//		String []s = str.split(" ");
//		for(int i=s.length-1;i>=0;i--) {
//			System.out.print(s[i]+".");
//		}
//		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//var list= strings.stream().filter(e-> e.isEmpty()).count();
		//System.out.println(list);
//	Random ran= new Random();
//	ran.ints(10000, 50000).limit(5).forEach(System.out::println);
	
//		List<Integer> numbers = Arrays.asList(3, 2, 1,2, 3, 7,8, 3, 5);
//		List<?> list= numbers.stream()
//				.map(e->e*e)
//				.filter(e->e>3)
//				.skip(4)
//				.distinct()
//				.limit(6)
//				.toList();
//	   System.out.println(list);
//		List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//     String lsit=  strings.stream().filter(e->!e.isEmpty()).collect(Collectors.joining((", ")));
//	  System.out.println(lsit);
		
	//	List<Integer> colors = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
	     List<String> colors = new ArrayList<>();
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
		//forward traversal
		ListIterator<String> en= colors.listIterator();
	        System.out.println("Backward traversal:");
	        while (en.hasPrevious()) {
	            int index = en.previousIndex();
	            String color = en.previous();
	            System.out.println("Index: " + index + ", Color: " + color);
	        }

	//System.out.println(list);
	}}





