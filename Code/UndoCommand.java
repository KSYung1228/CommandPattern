import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.Vector;

public class UndoCommand implements Command {
    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(is);
    Shape shape;
    Vector<Shape> shapes;
    Stack<Action> history;

    public UndoCommand(Vector<Shape> shapes, Stack<Action> history) {
        this.shapes = shapes;
        this.history = history;
    }

    @Override
    public void execute() {
        Action action = history.pop();
        switch (action.getOption()) {
            case 3:
                shapes.add(action.getIndex(), action.getShape());
                break;
            case 4:
            case 5:
                shapes.remove(action.getShape());
                break;
        }
    }

}
