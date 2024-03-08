package com.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FibnocciReverse {

	public static void main (String abc[]){
		FibnocciReverse obj = new FibnocciReverse();
		obj.printFibbBetween(10, 100);
	}

	public void printFibbBetween(int a, int b){

		List<Integer> valuesList = new ArrayList<>();
		valuesList.add(a);
		valuesList.add(a+1);
		int counter = 2;
		while(a<b){
			a = valuesList.get(counter-1) + valuesList.get(counter-2);
			valuesList.add(a);
			counter++;
		}
		if(a>b){
			valuesList.remove(valuesList.size()-1);
		}

		Collections.reverse(valuesList);

		for(int j : valuesList)
		System.out.println(j);

	}


}
