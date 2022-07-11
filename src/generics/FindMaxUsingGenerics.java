package generics;

public class FindMaxUsingGenerics {

	public static Integer getMax(Integer x, Integer y, Integer z) {
		// TODO Auto-generated method stub
		
		Integer max = x;
		if(y.compareTo(x)>0 && y.compareTo(z)>0)
			max = y;
		else if(z.compareTo(y)>0 && z.compareTo(x)>0)
			max = z;
		System.out.println("The Max is "+max);
		return max;
	}
}