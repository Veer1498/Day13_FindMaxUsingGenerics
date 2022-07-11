package generics;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Find Maxmum Program");
		FindMaxUsingGenerics findMax = new FindMaxUsingGenerics();
		
		findMax.getMax("Veerendra", "Sunny", "SV");
		findMax.getMax("Sunny", "Veerendra", "SV");
		findMax.getMax("Sunny", "SV", "Veerendra");
		
	}

}