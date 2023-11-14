import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.Vector;

public class DeleteCommand implements Command {
    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(is);
    Shape shape;
    Vector<Shape> shapes;
    Stack<Action> history;

    public DeleteCommand(Vector<Shape> shapes, Stack<Action> history) {
        this.shapes = shapes;
        this.history = history;
    }

    @Override
    public void undo() {
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
