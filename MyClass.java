package MyPack1;
import java.util.Scanner;

public class MyClass {
	public static double calculation(double fixSal,double SalesAmt) {
		double com=0;
		double commRate=0.12;
		if(SalesAmt>5000)
		{
			com=commRate*(SalesAmt-5000);
		}
		return (fixSal+com);
	}

	public static void main(String[] args) {
		double res;
		double fixSal,SalesAmt;
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the Sales Amount :");
		SalesAmt = myObj.nextDouble();
		System.out.println("Enter the Salary Amount :");
		fixSal = myObj.nextDouble();
		res=calculation(fixSal,SalesAmt);
		System.out.println(res);
		myObj.close();
	}

}
