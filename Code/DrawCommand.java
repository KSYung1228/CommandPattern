import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.Vector;

public class DrawCommand implements Command {
    Vector<Shape> shapes = new Vector<Shape>();
    Stack<Action> history = new Stack<Action>();
    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(is);
    Shape shape;

    @Override
    public void undo() {

    }

    @Override
    public void execute() {
        for (int i = 0; i < shapes.size(); i++)
            ((Shape) shapes.elementAt(i)).draw();
    }

}
