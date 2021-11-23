import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapeTest {

	@Test
	void test() {
		
		Square s = new Square(5, 5);
		assertEquals(s.perimeter(),20);
		assertEquals(s.area(),25);
		
		Square s1 = new Square(6,6);
		assertEquals(s1.perimeter(), 24);
		assertEquals(s1.area(),36);
		
		Rectangle r = new Rectangle (10,2);
		assertEquals(r.perimeter(),24);
		assertEquals(r.area(), 20);
		
		Rectangle r1 =  new Rectangle(2,4);
		assertEquals(r1.perimeter(),12);
		assertEquals(r1.area(), 8);
		
		
		Rhombus rh = new Rhombus(9,9, 7);
		assertEquals(rh.perimeter(), 36);
		assertEquals(rh.area(),63);
		
		Rhombus rh1 = new Rhombus(10,10,5);
		assertEquals(rh1.perimeter(), 40);
		assertEquals(rh1.area(),50);
		
		Equilateral e = new  Equilateral(3,3,3);
		assertEquals(e.perimeter(),9);
		assertEquals(e.area(),4);
		
		Equilateral e1 = new Equilateral(10,10,10);
		assertEquals(e1.perimeter(),30);
		assertEquals(e1.area(),43);
		
		
		Isosceles i = new Isosceles(6,6,8);
		assertEquals(i.perimeter(),20);
		assertEquals(i.area(),18);
		
		Isosceles i1 = new Isosceles(15,15,9);
		assertEquals(i1.perimeter(),39);
		assertEquals(i1.area(),64);		
		
		circle c = new circle (5);
		assertEquals(c.perimeter(),31);
		assertEquals(c.area(),79);
		
		circle c1 = new circle(9.6);
		assertEquals(c1.perimeter(),60);
		assertEquals(c1.area(),289);
		
		Scalene se = new Scalene(2,3,4);
		assertEquals(se.area() ,3);
		assertEquals(se.perimeter(), 9);
		
		Scalene se1 = new Scalene(2.8,3.5,4.9);
		assertEquals(se1.area() ,5);
		assertEquals(se1.perimeter(), 11.2);
		
		

	
		
		
		
		
		
		
	}

}
