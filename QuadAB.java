
public abstract class QuadAB extends ShapesAB implements quad{
	protected double length;
	
	protected QuadAB(double base, double length){
		this.base =base ;
		this.length= length;
		
		
	}
	
	public double getLength() {
		
		return this.length;
	}
	public double perimeter() {
		
	 return ( 2*this.base+2*this.length);
	}
	
	public double area() {
		return (base * length);
	}
	


}
