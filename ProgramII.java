package com.basic.program2;
import java.util.Scanner;

public class odd {

	public static void main(String[] args) {
		
				Scanner sc = new Scanner (System.in);
				System.out.println("Enter the limit");
				int a = sc.nextInt();
				int j =1;
				for (int i=1;i<=a;i++){
					if(i==1){
						System.out.println(j);
                          }
					else
					{
					j=j+2;
					System.out.println(j);
					}
					}
			}

	}


