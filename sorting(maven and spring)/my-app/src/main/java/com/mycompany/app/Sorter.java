package com.mycompany.app;
public class Sorter{
	Strategy strategy;
		
	public double[] Sort(double arr[], Strategy strategy)
	{
		return strategy.sort_strategy(arr);
	}
	public double[] Sort(double arr[])
	{
		return strategy.sort_strategy(arr);
	}
	
	 void display(double arr[])
	 {
	 	for(int i=0 ; i<arr.length ; i++)
	       	System.out.println(arr[i]);
	 }
	public static void main(String[] args)
	{
	       Sorter sorter = new Sorter();
	       double temp[] = {15, 13, 52, 1, 24};
	       double output[] = sorter.Sort(temp, new Bubble());
	       sorter.display(output);
	       System.out.println("--------------------------------------");
	      

	       double values[] = {25, 12, 32, 02};
	       double output1[] = sorter.Sort(values, new Mergesort());
	       	       sorter.display(output1);
	      

	       

	       
	}    
	       
	       
}

