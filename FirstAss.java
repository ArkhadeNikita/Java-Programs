package labAssignment;

import java.util.Scanner;

public class FirstAss {

	public static void main(String[] args) {
			String str1,str2;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter First String: ");
			str1=s.nextLine();
			System.out.println("Enter Second String: ");
			str2=s.nextLine();
			if(str1.equals(str2))
			{
				System.out.println("Both the Strings are Equals");
			}
			else
			{
				System.out.println("Strings are Not Equals");
			}
		


	}

}
