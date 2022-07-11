package generics;

public class FindMaxUsingGenerics {

	public static String getMax(String x, String y, String z) {
		// TODO Auto-generated method stub
		
		String max = x;
		if(y.compareTo(x)>0 && y.compareTo(z)>0)
			max = y;
		else if(z.compareTo(y)>0 && z.compareTo(x)>0)
			max = z;
		System.out.println("The Max is "+max);
		return max;
	}
}