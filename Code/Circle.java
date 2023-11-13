
public class Circle implements Shape {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void draw() {
		System.out.println("Circle, radius = " + radius);
	}
}