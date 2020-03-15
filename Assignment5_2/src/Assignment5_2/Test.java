package Assignment5_2;

public class Test {

	public static void main(String[] args) {

		ClosedCurve[] objects = {new Triangle(4,5,6),
								 new Square(3),
								 new Circle(3),
								 new Rectangle(7, 3)};
		//compute areas
		for(ClosedCurve cc : objects) {
			System.out.printf(cc.toString(),cc.computeArea());
			System.out.println();
			
		}
    
	}

}
