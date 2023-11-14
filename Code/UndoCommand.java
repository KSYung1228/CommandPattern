import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.Vector;

public class UndoCommand implements Command {
    Vector<Shape> shapes = new Vector<Shape>();
    Stack<Action> history = new Stack<Action>();
    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(is);
    Shape shape;

    @Override
    public void undo() {
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

    @Override
    public void execute() {

    }

}
