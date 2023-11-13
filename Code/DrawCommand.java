package Code;

import java.util.*;

public class DrawCommand implements Command {
    private Vector<Shape> shapes;

    public DrawCommand(Vector<Shape> shapes) {
        this.shapes = shapes;
    }

    @Override
    public void execute() {
        for (int i = 0; i < shapes.size(); i++)
            shapes.elementAt(i).draw();
    }

    @Override
    public void undo() {
        //
    }
}
