package Assignment5_2;

public class Rectangle extends ClosedCurve {
	private  double width;
	private double height;
	
	Rectangle(double height,double width)
	{
		this.width=width;
		this.height=height;
	}

	public double computeArea()
	{
		double area=width*height;
		return area;
	}
	public String toString() {
		return "Area of this Rectangle is %.2f";
}
}
