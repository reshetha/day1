package com.capgemini.day2.tests;

public class Bubblesort 
{
	public static int[] check(int[] js)
{
		// TODO Auto-generated method stubint arr[]= {45,52,56,8,9,2,4};
		int temp;
		int arr[]={0,0,0,0,0,0,0};
		int sortedarray[]= {0,0,0,0,0,0,0};
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5-i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					sortedarray[j++]=arr[j];
				}
			}
		}
	}
}