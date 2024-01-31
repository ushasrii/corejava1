import java.lang.Math;
class Circle{
	public static void main(String[] args){
		double radius, area, circumference;
		radius=10.0;
		area=(Math.PI*(radius*radius));
		circumference=2*Math.PI*radius;
		System.out.println("Area of Circle is: "+area);
		System.out.println("circumference of Circle is: "+circumference);
	}
}