public abstract class ATriangles extends ShapesAB implements Triangle  {

	protected double left;
	protected double right;
	protected double base;

	protected ATriangles(double left, double right, double base){
		this.base = base;
		this.left = left;
		this.right = right;


	}

	public double getleft() {
		return this.left;
	}


	public double getright() {

		return this.right;
	}



	public double perimeter() {

		return this.base+this.left+this.right;
	}
	public double area(){

		double semi = (right+left+base)/2;
		return  Math.round(Math.sqrt(semi*(semi-left)*(semi-right)*(semi-base)));

	}
}



