
public class Rhombus extends  QuadAB implements quad {

	protected double height; 

	protected Rhombus(double base, double length,double height) {
		super(length, base);
		this.height = height;
	}


	public double area() {
		return (base * height);
	}










}