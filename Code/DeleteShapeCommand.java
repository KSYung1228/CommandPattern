package Code;

import java.util.Vector;

public class DeleteShapeCommand implements Command {
    private Vector<Shape> shapes;
    private int index;
    private Shape deletedShape;

    public DeleteShapeCommand(Vector<Shape> shapes, int index) {
        this.shapes = shapes;
        this.index = index;
    }

    public void execute() {
        if (index >= 0 && index < shapes.size()) {
            deletedShape = shapes.remove(index);
        } else {
            throw new IllegalArgumentException("Index out of range");
        }
    }

    public void undo() {
        if (deletedShape != null) {
            shapes.add(index, deletedShape);
        }
    }
}
