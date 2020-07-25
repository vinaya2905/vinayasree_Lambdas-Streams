package com.epam.LambdasAndStreams;

public class Average {
	public double averageOfList(int[] list)
	   {
		   double sum=0;
		   for(int i=0;i<list.length;i++)
			   sum+=list[i];
		   return (double)(sum/list.length);
	   }
}
