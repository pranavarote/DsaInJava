package dsaInJava;

public class methods {
//	static int logic(int x,int y) {
//		int z;
//		if(x>y) {
//		z=x+y;
//		}
//		else {
//			z=(x+y)*5;
//		}
//		
//	return z;	
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int a,b,c;
//		a=12;
//		b=45;
//		c=logic(a,b);
//		System.out.println(c);
//
//	}
	 int logic(int x,int y) {
		int z;
		if(x>y) {
		z=x+y;
		}
		else {
			z=(x+y)*5;
		}
		
	return z;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		a=12;
		b=45;
		methods obj =new methods();
		c=obj.logic(a,b);
		System.out.println(c);

		
		

	}

}
