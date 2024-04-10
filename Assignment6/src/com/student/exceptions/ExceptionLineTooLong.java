package com.student.exceptions;

public class ExceptionLineTooLong extends Exception
{
	private int length;
	private String msg;
	
	
	public ExceptionLineTooLong() 
	{
		String msg="";
		int length=0;
		
	}

	public ExceptionLineTooLong( String msg,int length) 
	{
		this.length = length;
		this.msg = msg;
	}
		
	
	public void printStackTrace()
	{
		System.out.println("Exception:");
		System.out.println("ExceptionLineTooLong:" +msg);
		System.out.println("String Length:"+ length);
	}
	
}
