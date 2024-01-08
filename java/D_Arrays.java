package dsaInJava;

public class D_Arrays {

	public static void main(String[] args) {
//		int[]marks;
//		marks=new int[5];
//		marks[0]=12;
//		marks[1]=10;
//		marks[2]=34;
//		marks[3]=40;
//		marks[4]=39;
//		System.out.println(marks[4]);
//		int score []= {12,34,54,23,23,54};
//		System.out.println(score[4]);
//        System.out.println(score.length);
//        for(int i=0;i<score.length;i++) {
//        	System.out.println(score[i]);
//        }
//        //print the array in reverse order
//        System.out.println("array in reverse order");
//        for(int i=score.length-1;i>=0;i--) {
//        	System.out.println(score[i]);
//        }
//        //printing elements of array by using for each loop
//        System.out.println("printing array elements using for each loop");
//        for(int element:score) {
//        	System.out.println(element);
//        }
        //multidimensional array
//        int [][]flat=new int[2][3];
//        flat[0][0]=10;
//        flat[0][1]=11;
//        flat[0][2]=12;
//        flat[1][0]=13;
//        flat[1][1]=14;
//        flat[1][2]=15;
//        System.out.println(flat[1][0]);
//        
//        for(int i=0;i<flat.length;i++) {
//        	for(int j=0;j < flat[i].length;j++){
//        		System.out.print(flat[i][j]);
//        		System.out.print(" ");
//        		
//        	}
//        	System.out.println("\n");
//        }
//       
//		float score []= {12,34,54,23,23,54};
//		float num=12;
//		boolean isInArray=false;
//		for(float element:score) {
//			if(num==element) {
//				isInArray=true;
//				break;
//			}
//		}
//			if(isInArray) {
//				System.out.println("the value is present in the array");
//			}
//			else {
//				System.out.println("the value is not present in the array");
//			}
//		
//        
//		float score []= {12,34,54,23,23,54};
//		float sum=0;
//		for(float elements:score) {
//			sum= sum + elements;
//		}
//		System.out.println("the average of the array is : "+sum/score.length);
		   int [][] mat1 = {{1, 2, 3},
                   {4, 5, 6}};
  int [][] mat2 = {{2, 6, 13},
                   {3, 7, 1}};
  int [][] result = {{0, 0, 0},
                     {0, 0, 0}};

  for (int i=0;i<mat1.length;i++){ // row number of times
      for (int j=0;j<mat1[i].length;j++) { // column number of time
          
          result[i][j] = mat1[i][j] + mat2[i][j];
      }
  }

  // Printing the elements of a 2-D Array
  for (int i=0;i<mat1.length;i++){ // row number of times
      for (int j=0;j<mat1[i].length;j++) { // column number of time
          System.out.print(result[i][j] + " ");
          result[i][j] = mat1[i][j] + mat2[i][j];
      }
      System.out.println(""); // Prints a new line
  }

	}

	}
