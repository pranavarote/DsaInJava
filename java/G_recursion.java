package dsaInJava;

public class G_recursion {
	static int factorial(int n) {
		int product=1;
		for(int i=1;i<=n;i++) {
			product=product*i;
		}
		return product;
	}
	static int recursive_fact(int n) {
		if (n==0||n==1) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}

	public static void main(String[] args) {
		System.out.println("factorial of the no " + recursive_fact(5));

	}

}
