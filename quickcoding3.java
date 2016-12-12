package first;

import java.util.Scanner;
import java.util.InputMismatchException;
public class exception {
	static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) throws Exception{
		int a,b;
		int c,d;
		System.out.println("두 숫자를 입력하세요");
		try{
		a= sc.nextInt();
		b= sc.nextInt();
		if(a>100 || b>100){Exception e= new Exception("받은숫자가 3자리를 넘어갑니다.");
		throw e;
		}c=a/b;
		d=b/a;
		
		}
		catch(InputMismatchException e){
			System.out.println("The input is not integer");
		}
		catch(ArithmeticException e)
		{
			System.out.println("The input doesn't devied 0");
		}
		
		finally{
			System.out.println("finally!");
		}
	}

}
