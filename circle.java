
public class circle extends ShapesAB implements IShape{
	
	double PI= 3.14;

	public circle(double radius) {

	    this.base = radius;
	}

	public double area() {

		return Math.round( PI* Math.pow(base, 2));
	}


	public double perimeter() {
		return Math.round((2*PI*base));
	}




}

