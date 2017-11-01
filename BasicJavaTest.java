import java.util.ArrayList;

public class BasicJavaTest{
	  public static void main(String[] args){
		BasicJava test = new BasicJava();
		
		test.print1To255();
		test.printOdd1To255();
		test.printSum1To255();
		int[] myArray = {4,8,-8,5,9};
		test.iterArr(myArray);
		test.arrayMax(myArray);
		test.arrayAverage(myArray);
		ArrayList<Integer> test1 = test.arrayOdd1To255();
		System.out.println(test1);
		int Y = 5;
		int Ytest = test.greaterThanY(Y,myArray);
		System.out.println("There are " + Ytest + " items greater than " + Y + " in the test.");
	  }
}