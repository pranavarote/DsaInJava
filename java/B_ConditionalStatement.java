package dsaInJava;
import java.util.*;
public class B_ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int age=18;
//		if(age>=18) {
//			System.out.println("you are allowed to vote");
//		}
//		else{
//			System.out.println("you are not a;;owed to vote");
//			
//		}
//    Scanner sc=new Scanner(System.in);
//    System.out.println("enter your age :");
//    int age =sc.nextInt();
//    if(age>=18) {
//    	System.out.println("you can vote");
//    }
//    else if( age == 17) {
//    	System.out.println("you can wait for one more year");
//    }
//    else {
//    	System.out.println("you cannot vote");
//    }
//    Scanner sc=new Scanner(System.in);
//    System.out.println("enter a button no");
//    int button=sc.nextInt();
//    
//    if(button==1) {
//    	System.out.println("Namste");
//    }
//    else if (button==2) {
//    	System.out.println("Hello");
//    }
//    else if(button == 3) {
//    	System.out.println("Ram Ram");
//    }
//    else {
//    	System.out.println("invalid button");
//    }
//       
		 Scanner sc=new Scanner(System.in);
		 System.out.print("enter firstno");
		 int a=sc.nextInt();
		 System.out.println("enter a operation :");
		 int op =sc.nextInt();
		 System.out.print("enter second no");
		 int b=sc.nextInt();
		 switch(op) {
		 case 1: 
			 System.out.print("addition of "+a +" and "+b+" is : " +(a+b));
			 break;
		 
	     case 2: 
	   	     System.out.print("subtraction of "+a +" and "+b+" is : " +(a-b));
	   	     break;
	 
         case 3: 
	         System.out.print("multiplication of "+a +" and "+b+" is : " +(a*b));
	         break;
	         
 
         case 4: 
	         System.out.print("division of "+a +" and "+b+" is : " +(a/b));
	         break;
}
		 }
		 
    
	}

	

