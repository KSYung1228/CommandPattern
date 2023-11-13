package Code;

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Vector<Shape> shapes = new Vector<Shape>();
		Stack<Action> history = new Stack<Action>();
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		Shape shape;

		while (true) {
			try {
				System.out.println("0 = exit, 1 = undo, 2 = draw all shapes, " +
						"3 = delete a shape, 4 = create circle, 5 = create rectangle");
				System.out.print("Enter option: ");
				String line = br.readLine();
				int option = Integer.parseInt(line);
				switch (option) {
					case 0:
						System.out.println("-- End --");
						System.exit(0);
					case 1:
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
						break;
					case 2:
						for (int i = 0; i < shapes.size(); i++)
							((Shape) shapes.elementAt(i)).draw();
						break;
					case 3:
						System.out.print("Enter index of the shape: ");
						line = br.readLine();
						int index = Integer.parseInt(line);
						if (index < 0 || index >= shapes.size())
							throw new Exception("Out of Range");
						shape = shapes.get(index);
						shapes.remove(shape);
						history.push(new Action(3, shape, index));
						break;
					case 4:
						System.out.print("Enter radius: ");
						line = br.readLine();
						int radius = Integer.parseInt(line);
						shape = new Circle(radius);
						shapes.add(shape);
						history.push(new Action(4, shape, -1));
						break;
					case 5:
						System.out.print("Enter width: ");
						line = br.readLine();
						int width = Integer.parseInt(line);
						System.out.print("Enter height: ");
						line = br.readLine();
						int height = Integer.parseInt(line);
						shape = new Rectangle(width, height);
						shapes.add(shape);
						history.push(new Action(5, shape, -1));
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
