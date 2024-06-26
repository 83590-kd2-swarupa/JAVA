/*
Q1. Write a generic sort method for implementing selection sort algorithm with given comparator
Object as parameter. Below is reference code for selection sort do the respective changes to make it
generic using comparator
static void selectionSort(Integer [] arr) {
for(int i=0; i<arr.length-1; i++)
for(int j=i+1; j<arr.length; j++)
if(arr[i] > arr[j]) {
Integer temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
}
*/

package que1;

import java.util.Comparator;


public class GenericSelectionSort 
{
	public static <T> void SelectionSort(T[] arr,Comparator<T> c)
	{
		for(int i=0;i<arr.length-1;i++)
			for(int j=i+1;j<arr.length;j++)
				if(c.compare(arr[i], arr[j])>0)
				{
					T temp=arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
	}
	
	public static void main(String[] args)
	{
		class Test implements Comparator<Integer>
		{

			@Override
			public int compare(Integer o1, Integer o2) 
			{
				int diff = Integer.compare(o1, o2);
				return diff;
			}
		}
		
		Test t = new Test();
		Integer[] arr = {2,9,13,30,1,22};
		System.out.println("Before sort:");
		for(Integer integer : arr)
		{
			System.out.println(integer);
		}
		
		SelectionSort(arr,t);
		System.out.println("After Sort:");
		for(Integer integer : arr)
		{
			System.out.println(integer);
		}
   }
}
