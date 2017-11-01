import java.util.ArrayList;

public class BasicJava{
	public void print1To255(){
		for(int i = 1; i<=255; i++){
			System.out.println(i);
		}
	}
	
	public void printOdd1To255(){
		for(int i = 1; i<=255; i++){
			if (i % 2 != 0){
			System.out.println(i);
			}
		}
	}
	
	public void printSum1To255(){
		int sum;
		sum = 0;
		for(int i = 1; i<=255; i++){
			sum += i;
			System.out.println("Number: " + i + " Sum: " + sum);
		}
	}
	
	public void iterArr(int[] arr){
		for(int x : arr){
			System.out.println(x);
		}
	}
	
	public void arrayMax(int[] arr){
		int max = 0;
		for(int x : arr){
			if (x > max){
				max = x;
			}
		}
		System.out.println("Max of test array is " + max);
	}
	
	public void arrayAverage(int[] arr){
		int sum = 0;
		for(int x : arr){
			sum += x;
		}
		int avg = sum/arr.length;
		System.out.println("Average of test array is " + avg);
	}
	
	
	public ArrayList<Integer> arrayOdd1To255(){
		ArrayList<Integer> y = new ArrayList<Integer>();
		int num = 1;
		for(int i=0; i<=254; i++){
			y.add(num);
			num ++;
		}
		return(y);
	}
	
	public int greaterThanY(int Y, int[] arr){
		int count = 0;
		for(int i : arr){
			if(Y < i){
				count ++;
			}
		}
		return(count);
	}
	
}