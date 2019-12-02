package main;

public class UniqueSum {

	static int num1 = 1;
	static int num2 = 1;
	static int num3 = 2;

	public static void main(String[] args) {

		uniqueSum();
	}

	public static void uniqueSum(){

		int numCheck1 = num1;
		int numCheck2 = num2;
		int numCheck3 = num3;

		if (num1 == num2){
			numCheck1 = 0;
			numCheck2 = 0;
		}

		if (num1 == num3){
			numCheck1 = 0;
			numCheck3 = 0;
		}

		if (num2 == num3){
			numCheck2 = 0;
			numCheck3 = 0;
		}

		num1 = numCheck1;
		num2 = numCheck2;
		num3 = numCheck3;

		int finalNum = num1+num2+num3;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println("\n"+finalNum);
	}
}