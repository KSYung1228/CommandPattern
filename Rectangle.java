
public class Rectangle implements Shape {
	private int width, height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void draw() {
		System.out.println("Rectangle, width = " +width + ", height = " + height);
	}
}