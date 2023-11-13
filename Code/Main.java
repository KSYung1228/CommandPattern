package Code;

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Vector<Shape> shapes = new Vector<Shape>();
		Stack<Command> history = new Stack<Command>();
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		Command[] cmd = new Command[6];

		cmd[0] = new ExitCommand();
		cmd[1] = new UndoCommand(history);
		cmd[2] = new DrawCommand(shapes);

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
						break;
					case 1:
						cmd[1].execute();
						break;
					case 2:
						cmd[2] = new DrawCommand(shapes);
						cmd[2].execute();
						history.push(cmd[2]);
						break;
					case 3:
						System.out.print("Enter index of the shape: ");
						line = br.readLine();
						int index = Integer.parseInt(line);
						if (index < 0 || index >= shapes.size())
							throw new Exception("Out of Range");
						cmd[3] = new DeleteShapeCommand(shapes, index);
						cmd[3].execute();
						history.push(cmd[3]);
						break;
					case 4:
						System.out.print("Enter radius: ");
						line = br.readLine();
						int radius = Integer.parseInt(line);
						cmd[4] = new CreateCircleCommand(shapes, radius);
						cmd[4].execute();
						history.push(cmd[4]);
						break;
					case 5:
						System.out.print("Enter width: ");
						line = br.readLine();
						int width = Integer.parseInt(line);
						System.out.print("Enter height: ");
						line = br.readLine();
						int height = Integer.parseInt(line);
						cmd[5] = new CreateRectangleCommand(shapes, width, height);
						cmd[5].execute();
						history.push(cmd[5]);
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
