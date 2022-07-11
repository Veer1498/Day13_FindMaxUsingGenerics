package generics;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Find Maxmum Program");
		FindMaxUsingGenerics findMax = new FindMaxUsingGenerics();
		
		findMax.getMax(30, 20, 10);
		findMax.getMax(10, 30, 20);
		findMax.getMax(10, 20, 30);

	}

}