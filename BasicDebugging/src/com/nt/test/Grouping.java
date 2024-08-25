package com.nt.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Grouping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,3,1,4,2,2,2,2,6,6,6,1,9));
		Map<Integer, Optional<Integer>> maps = numbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.reducing((a,b)->a+b)));
         System.out.println(maps);
        System.out.println("commit from datajpacommit1");
        System.out.println("commit2 from restworkspace");
        System.out.println("commit1inbranchfromdatajpa");
        System.out.println("commit1 in branch1 from rest ");
	}

}
