package com.epam.LambdasAndStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class App 
{
    public static void main( String[] args )
    {
    	int[] ar= {7,8,9,10,11,12};
        Average avg=new Average();
        System.out.println(avg.averageOfList(ar));
        
        FilterList f=new FilterList();
        String[] s= {"abc","Abc","asdg","oinn","ads","aefg"};
        ArrayList<String> l=f.filterListStartingWithLengthThreeAndStartingWithA(s,(String str)->(str.length()==3 && str.charAt(0)=='a'));
        System.out.println(l);
        
        
        String[] a={"aaa","Abcd","efgh","oo","okda","amkd","ahbk"};
        List<String> p= Arrays.asList(a);
        List<String> pal=App.filterPalindromes((p),(String str)->(Predicates.isPalindrome(str)));
        System.out.println(pal);
     }
     private static List<String> filterPalindromes(List<String> p, Predicate<String> predicate) {
 		// TODO Auto-generated method stub
     	ArrayList<String> l=new ArrayList<String>();
     	for(String s: p)
     	{
     		if(predicate.test(s)) l.add(s);
     	}
 		return l;
 	}
}

