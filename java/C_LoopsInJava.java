package dsaInJava;
import java.util.*;
import java.lang.Math;
public class C_LoopsInJava {

	public static void main(String[] args) {
//		for(int i=0;i<=10;i++) {
//			System.out.println(i);
//		}

		//Write a program to calculate the sum of first 10 natural number.
		//int n=10;
//		int sum=0;
//		for (int i=0;i<=n;i++) {
//			sum+=i;
//			System.out.println(sum);
//		}
//		System.out.println(sum);
		//Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter a no to calculate the table");
//		int a=sc.nextInt();
//		for(int i=1;i<=10;i++) {
//			int mul = a*i;
//			System.out.println(a +"*"+ i +"="+(a*i));
			
		//Write a program to find the factorial value of any number entered through the keyboard.
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter a no to calculate factorial");
//		int a=sc.nextInt();
//		int factorial=1;
//		for(int i=1;i<=a;i++) {
//			factorial*=i;
//			System.out.println(factorial);
//		}
//		
	
		//Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)
//		Scanner sc=new Scanner(System.in);
//	    System.out.println("enter your first number");
//        int a=sc.nextInt();
//        System.out.println("enter your power number");
//        int b=sc.nextInt();
//        int result=1;
//        for(int i=1;i<=b;i++) {
//        	result *=a;
//        	
//        }
//        System.out.println(result);
		//Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.
//		Scanner sc=new Scanner(System.in);
//	    System.out.println("enter your number");
//        int a=sc.nextInt();
//        int reverse = 0;
//        while(a>0) {
//        	int remainder = a%10;
//        	reverse = reverse*10 + remainder;
//        	a/=10;
//        }
//        System.out.println("reverse number is "+ reverse);
//        
		//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
//		Scanner sc=new Scanner(System.in);
//	    System.out.println("enter your first number");
//        int n=sc.nextInt();
//        int sum=0;
//        int odd =0;
//        for(int i=1;i<=n;i++) {
//        	if(i%2==0) {
//        		sum +=i;
//        	}
//        	
//        }
//        System.out.println("addition of the even numbers id "+sum);
//        for(int i=1;i<=n;i++) {
//        	if(i%2!=0) {
//        		odd +=i;
//        	}
//        	
//        }
//        System.out.println("addition of the first  odd numbers id "+ odd);
		//Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number. 
//		Scanner sc=new Scanner(System.in);
//	    System.out.println("enter a positive number");
//        int a=sc.nextInt();
//        for(int i=2;i<a;i++) {
//        	if((a%2)!=0) {
//        	System.out.println(a+"is a prime number");
//        	}
//        	else {
//        		System.out.println("not a prime number");
//        	}
//        	
//        }
		
//		        Scanner console = new Scanner(System.in);
//		     
//		        int dividend, divisor;
//		        int remainder, hcf = 0;
//		        
//		        System.out.print("Enter the first number ");
//		        dividend = console.nextInt();
//		        
//		        System.out.print("Enter the second number ");
//		        divisor = console.nextInt();        
//		        
//		        do
//			{
//		            remainder = dividend % divisor;
//		            
//		            if(remainder == 0)
//		            {
//		                hcf = divisor;
//		            }
//			    else
//		            {
//		                dividend = divisor;
//		                divisor = remainder;
//			    }
//		            
//		        }while(remainder != 0);
//
//		        System.out.println("HCF: " + hcf);
//		     
		 Scanner console = new Scanner(System.in);
	     
	        int number1, number2;
	        char choice;
	        
	        do
	        {
	            System.out.print("Enter the first number ");
	            number1 = console.nextInt();
	          
	            System.out.print("Enter the second number ");
	            number2 = console.nextInt();
	            
	            int sum = number1 + number2;
	            System.out.println("Sum of numbers: " + sum);
	        
	            System.out.print("Do you want to continue y/n? ");
	            choice = console.next().charAt(0);
	            
	            System.out.println();
	            
	        }while(choice=='y' || choice == 'Y');
		
	}

}
