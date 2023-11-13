package Code;

import java.util.Vector;

public class CreateRectangleCommand implements Command {
    private Vector<Shape> shapes;
    private Rectangle rectangle;

    public CreateRectangleCommand(Vector<Shape> shapes, int width, int height) {
        this.shapes = shapes;
        this.rectangle = new Rectangle(width, height);
    }

    @Override
    public void execute() {
        shapes.add(rectangle);
    }

    @Override
    public void undo() {
        shapes.remove(rectangle);
    }

    @Override
    public void exit() {
        // Nothing to do
    }
}
