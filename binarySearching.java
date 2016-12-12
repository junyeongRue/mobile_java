package first;
import java.util.Scanner;
public class binarySeaching {

	public static void main(String[] args) {
		
		int [] S = {1,2,4,7,8,9,10,11,22,33,45,66,77,87};
		Scanner sc= new Scanner(System.in);
		int first=0; 
		        int last=S.length-1; 
		        int mid = (first+last)/2; 
		        int find;
		        System.out.println("Input what you want to find number :");
		        find = sc.nextInt();
		        while(first<=last) 
		        { 
		           if(S[mid]>find) 
		           { 
		              last = mid-1; 
		              mid = (first+last)/2; 
		           } 
		           else if(S[mid]<find) 
		           { 
		              first = mid+1; 
		              mid = (first+last)/2; 
		           }   
		           else 
		           {       
		              break; 
		           } 
		        } 
		        if(S[mid]==find) 
		        { 
		           System.out.println("Find!"); 
		        } 
		        else if(S[mid]!=find) 
		        { 
		           System.out.println("Fail!"); 
		        } 
		} 
	
}


      
