package Code;

import java.util.*;

public class CreateRectangleCommand implements Command {
    private Vector<Shape> shapes;
    private int width;
    private int height;
    private Rectangle createdRectangle;

    public CreateRectangleCommand(Vector<Shape> shapes, int width, int height) {
        this.shapes = shapes;
        this.width = width;
        this.height = height;
    }

    public void execute() {
        createdRectangle = new Rectangle(width, height);
        shapes.add(createdRectangle);
    }

    public void undo() {
        shapes.remove(createdRectangle);
    }
}
