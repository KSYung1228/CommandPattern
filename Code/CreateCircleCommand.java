import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.Vector;

public class CreateCircleCommand implements Command {
    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(is);
    Vector<Shape> shapes;
    Stack<Action> history;
    Shape shape;

    public CreateCircleCommand(Vector<Shape> shapes, Stack<Action> history) {
        this.shapes = shapes;
        this.history = history;
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
