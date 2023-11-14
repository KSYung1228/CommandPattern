import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.Vector;

public class CreateRectangleCommand implements Command {
    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(is);
    public Shape shape;
    Vector<Shape> shapes;
    Stack<Action> history;

    public CreateRectangleCommand(Vector<Shape> shapes, Stack<Action> history) {
        this.shapes = shapes;
        this.history = history;
    }

    @Override
    public void undo() {
    }

    @Override
    public void execute() {
        try {
            System.out.print("Enter width: ");
            String line = br.readLine();
            int width = Integer.parseInt(line);
            System.out.print("Enter height: ");
            line = br.readLine();
            int height = Integer.parseInt(line);
            shape = new Rectangle(width, height);
            shapes.add(shape);
            history.push(new Action(5, shape, -1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
