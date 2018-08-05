package wangyi.set_pratice;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("X");
		set.add("y");
		
		
		set.add(";");
		Set<String> set2=new HashSet<>();
		set2.add("1");
		set2.add("2");
		set.addAll(set2);
		set.contains("y");
		System.out.println(set.containsAll(set2));
		for (String ele : set) {
			System.out.println(ele);
		}
		//System.out.println(set2.hashCode());
	}

}
