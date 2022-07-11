package generics;

public class Max<S extends Comparable> {
	S x,y,z;
	

	public Max(S x, S y, S z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}


	public S getX() {
		return x;
	}


	public void setX(S x) {
		this.x = x;
	}


	public S getY() {
		return y;
	}


	public void setY(S y) {
		this.y = y;
	}


	public S getZ() {
		return z;
	}


	public void setZ(S z) {
		this.z = z;
	}


}