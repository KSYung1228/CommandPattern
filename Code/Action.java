
public class Action {
	private int option;
	private Shape shape;
	private int index;
	
	public Action(int option, Shape shape, int index) {
		this.option = option;
		this.shape = shape;
		this.index = index;
	}
	
	public int getOption() { return option; }
	public Shape getShape() { return shape; }
	public int getIndex() { return index; }
}
