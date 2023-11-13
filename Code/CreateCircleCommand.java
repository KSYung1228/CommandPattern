package Code;

import java.util.Vector;

public class CreateCircleCommand implements Command {
    private Vector<Shape> shapes;
    private int radius;
    private Circle createdCircle;

    public CreateCircleCommand(Vector<Shape> shapes, int radius) {
        this.shapes = shapes;
        this.radius = radius;
    }

    public void execute() {
        createdCircle = new Circle(radius);
        shapes.add(createdCircle);
    }

    public void undo() {
        shapes.remove(createdCircle);
    }
}
