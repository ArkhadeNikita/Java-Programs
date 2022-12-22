package labAssignment;

import java.util.Scanner;

public class ThirdAss {

	public static void main(String[] args) {
				String str1,rev="";
				Scanner sc=new Scanner(System.in);
		        System.out.println("Enter the String to Reverse");
		        str1=sc.nextLine();
		        //str1=rev(str1);
		        int lenght=str1.length();
		        for(int i=lenght-1;i>=0;i--)
		        {
		        	rev=rev+str1.charAt(i);
		        	//str2=rev.toUpperCase();
		        	
		        }
		        System.out.println("Reverse String is: "+rev.toUpperCase());

		}

	}
