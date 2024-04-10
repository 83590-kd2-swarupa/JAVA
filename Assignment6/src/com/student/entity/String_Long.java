/*
Q1. Define a new exception, called ExceptionLineTooLong, that prints out the error message "The
strings is too long". Write a program that reads a String from user and calculates its length. and
throws an exception of type ExceptionLineTooLong in the case where a string of length is more
than 80 characters.
(Hint- Use String class length() method)
*/

package com.student.entity;

import java.util.Scanner;

import com.student.exceptions.ExceptionLineTooLong;

public class String_Long 
{
	String word;

    public void accept(Scanner sc) throws ExceptionLineTooLong
    {
        System.out.print("Enter a String:");
        word=sc.nextLine();
        
        if(word.length()>80)
        {
        	throw new ExceptionLineTooLong("String is Too Long.",word.length());
        }
        
        else
        {
        	System.out.println("String is Valid");
        }
    }

}
