package Code;

import java.util.Vector;

class CreateCircleCommand implements Command {
    private Vector<Shape> shapes;
    private Circle circle;

    public CreateCircleCommand(Vector<Shape> shapes, int radius) {
        this.shapes = shapes;
        this.circle = new Circle(radius);
    }

    @Override
    public void execute() {
        shapes.add(circle);
    }

    @Override
    public void undo() {
        shapes.remove(circle);
    }

    @Override
    public void exit() {
        // nothing to do
    }

}