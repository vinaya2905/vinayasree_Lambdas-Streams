package com.epam.LambdasAndStreams;

import java.util.ArrayList;
import java.util.function.Predicate;

public class FilterList {
	
	public ArrayList<String> filterListStartingWithLengthThreeAndStartingWithA(String[] s, Predicate<String> predicate) {
		// TODO Auto-generated method stub
		ArrayList<String> FL=new ArrayList<String>();
		for(String str:s)
		{
			if(predicate.test(str))
			{
				FL.add(str);
			}
		}
		return FL;
	}
}
