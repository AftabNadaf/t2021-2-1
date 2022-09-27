package com.basic.program1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a and b");
        a = sc.nextDouble();
        b = sc.nextDouble();
       // String op= "+,-,*,/";
        System.out.println("Enter the operator (+, -, *, /)");
        char op = sc.next().charAt(0);
        double o = 0;
        switch (op)
        {
        case '+':
        	o = a+b;
        	break;
        case '-':
        	o = a-b;
        	break;
        case '*':
        	o = a*b;
        	break;
        case '/':
        	o = a/b;
        	break;
        	default:
        		System.out.println("you have entered wrong operator");
        		break;
        }
        System.out.println("The result is: ");
        System.out.println(a + " " + op + " " + b + "=" + o);
        
	}

}
