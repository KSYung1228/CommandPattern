import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.Vector;

public class DeleteCommand implements Command {
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
        try {
            System.out.print("Enter index of the shape: ");
            String line = br.readLine();
            int index = Integer.parseInt(line);
            if (index < 0 || index >= shapes.size())
                throw new Exception("Out of Range");
            shape = shapes.get(index);
            shapes.remove(shape);
            history.push(new Action(3, shape, index));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
