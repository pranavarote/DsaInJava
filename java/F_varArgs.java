package dsaInJava;

public class F_varArgs {
	static int sum (int ...arr) {
		int result =0;
		for(int a:arr) {
			result=result+a;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("the of the elements is "+sum(2,5));
		System.out.println("the of the elements is "+sum(2,5,5,6,4));
		System.out.println("the of the elements is "+sum(2,5,8,9));
		System.out.println("the of the elements is "+sum(2,5,6,4));

	}

}
