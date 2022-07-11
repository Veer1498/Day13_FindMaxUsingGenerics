package generics;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Find Maxmum Program");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Integer Input");
		testMax(sc.next(), sc.next(), sc.next());
	//	testMax(10, 30, 20);
	//	testMax(10, 20, 30);
		
		
		
	}
	public static <S extends Comparable> S testMax(S x, S y, S z) {
		// TODO Auto-generated method stub
		
		S max = x;
		if(y.compareTo(x)>0 && y.compareTo(z)>0)
			max = y;
		else if(z.compareTo(y)>0 && z.compareTo(x)>0)
			max = z;
		System.out.println("The Max is "+max);
		return max;
	}

}