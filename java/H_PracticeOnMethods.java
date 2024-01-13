package dsaInJava;

public class H_PracticeOnMethods {
	static void multiplication(int n) {
		for(int i=1;i<=10;i++) {
			System.out.format("%d X %d = %d \n",n,i,n*i);
			
		}
	}
	static void pattern(int n) {
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				
			}
			System.out.println();
			
			
			
		}
	}
	static int sumrec(int n) {
		if(n==1) {
			return 1;
		}
		
			return n + sumrec(n-1);
		
	}
	static int fib(int n) {
		if(n==0 || n==1) {
			return n-1;
		}
		else {
		return fib(n-1) + fib(n-2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiplication(8);
		pattern(4);
		int c=sumrec(4);
		System.out.println(c);
        int result=fib(9);
        System.out.println(result);
	}

}
