package Assignment5_4;



public class Test2 {
	public static void main(String[] args) {

		Polygon[] objects = {new Triangle(4,5,6),
								 new Square(3),
								 new Rectangle(7, 3)};
		//compute areas
		for(Polygon cc : objects) {
			System.out.printf(cc.toString(),cc.getNumberOfSides(),cc.computePerimeter());
			System.out.println();
			
		}
    
	}

}
