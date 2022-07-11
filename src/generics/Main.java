package generics;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Find Maxmum Program");
		FindMaxUsingGenerics findMax = new FindMaxUsingGenerics();
		
		System.out.println("String Input");

		findMax.getMax("Veerendra", "Sunny", "SV");
		findMax.getMax("Sunny", "Veerendra", "SV");
		findMax.getMax("Sunny", "SV", "Veerendra");
		
		
		System.out.println("Float Input");
		findMax.getMax(30.2f, 20.1f, 10.2f);
		findMax.getMax(10.2f, 30.2f, 20.2f);
		findMax.getMax(10.2f, 20.2f, 30.2f);
		
		System.out.println("Integer Input");

		findMax.getMax(30, 20, 10);
		findMax.getMax(10, 30, 20);
		findMax.getMax(10, 20, 30);
		
		
		
	}

}