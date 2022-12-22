package labAssignment;

import java.util.Scanner;

public class SecondAss {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name");
		String s1 = sc.nextLine();
		System.out.println("Confirm your Name");
		String s2 = sc.nextLine();

       if(s1.equals(s2)) 
       {
    	   System.out.println("cangrats both values match!!");
       } 
       else 
       {
    	   System.out.println("Name already Exist");
       }

	}

}
