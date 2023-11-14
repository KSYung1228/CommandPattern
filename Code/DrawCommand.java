import java.util.Stack;
import java.util.Vector;

public class DrawCommand implements Command {
    Vector<Shape> shapes;
    Stack<Action> history;

    public DrawCommand(Vector<Shape> shapes, Stack<Action> history) {
        this.shapes = shapes;
        this.history = history;
    }

    @Override
    public void execute() {
        for (int i = 0; i < shapes.size(); i++)
            ((Shape) shapes.elementAt(i)).draw();
    }

}
