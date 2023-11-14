
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Vector<Shape> shapes = new Vector<Shape>();
		Stack<Action> history = new Stack<Action>();
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		Command[] cmd = new Command[6];

		cmd[0] = new ExitCommand();
		cmd[1] = new UndoCommand(shapes, history);
		cmd[2] = new DrawCommand(shapes, history);
		cmd[3] = new DeleteCommand(shapes, history);
		cmd[4] = new CreateCircleCommand(shapes, history);
		cmd[5] = new CreateRectangleCommand(shapes, history);

		while (true) {
			try {
				System.out.println("0 = exit, 1 = undo, 2 = draw all shapes, " +
						"3 = delete a shape, 4 = create circle, 5 = create rectangle");
				System.out.print("Enter option: ");
				String line = br.readLine();
				int option = Integer.parseInt(line);
				switch (option) {
					case 0:
						cmd[0].execute();
					case 1:
						cmd[1].execute();
						break;
					case 2:
						cmd[2].execute();
						break;
					case 3:
						cmd[3].execute();
						break;
					case 4:
						cmd[4].execute();
						break;
					case 5:
						cmd[5].execute();
						break;
					default:
						throw new Exception("Invalid Option");
				}
			} catch (Exception e) {
				System.out.println("*** " + e.getMessage());
			}
			System.out.println();
		}
	}
}
