package labAssignment;

import java.util.Scanner;

interface Print
{
	public void claSquare();
	
}
interface Calculate
{
	public void claCube();
}
class UseSquare implements Print
{
	public void claSquare()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number:");
		int x=sc.nextInt();
		int y=x*x;
		System.out.println("The Square :- "+x+" is "+y);
	}
}
class UseCube implements Calculate
{
	public void claCube()
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Cube of the Given Number is:"+(n*n*n));
	}
}

public class FourtAss {

	public static void main(String[] args) {
		UseSquare s=new UseSquare();
		UseCube c=new UseCube();
		s.claSquare();
		c.claCube();
	}

}
