package in.com.rays1methodreturn;

public class Shape {
	public double area() {
		System.out.println("Shape Area Method..!!!");
		return 0;
	}

	public static Rectangle getShape(int i) {
		if (i == 1) {
			return new Rectangle(10, 20);
		}
		if (i == 2) {
			return new Circle(10);
		}
		if (i == 3) {
			return new Triangle(10, 20);
		}
		return new Shape();
}
}