package Assignment5_4;

public class Rectangle extends ClosedCurve implements Polygon {
private double width;
private double height;
	Rectangle(double height,double width)
	{
		this.width=width;
		this.height=height;
	}
	@Override
	public int getNumberOfSides() {
		
		return 4;
	}

	@Override
	public double computePerimeter() {
		
		return 2*(width+height);
	}
	public double computeArea()
	{
		double area=width*height;
		return area;
	}
	public String toString() {
		return "For this Rectangle \n Number of side is %d \n Perimeter is %.2f";
}

}
