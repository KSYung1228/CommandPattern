import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.Vector;

public class CreateCircleCommand implements Command {
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
        try {
            System.out.print("Enter radius: ");
            String line = br.readLine();
            int radius = Integer.parseInt(line);
            shape = new Circle(radius);
            shapes.add(shape);
            history.push(new Action(4, shape, -1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
