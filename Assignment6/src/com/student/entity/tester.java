package com.student.entity;

import java.util.Scanner;
import com.student.exceptions.ExceptionLineTooLong;

public class tester 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String_Long s=new String_Long();
		
		try
		{
			s.accept(sc);
		}
		catch(ExceptionLineTooLong e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Program Completed Successfully");
	}

}
