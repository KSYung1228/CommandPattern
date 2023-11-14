
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Vector<Shape> shapes = new Vector<Shape>();
		Stack<Action> history = new Stack<Action>();
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		Shape shape;
		Command[] cmd = new Command[5];

		cmd[0] = new ExitCommand();

		while (true) {
			try {
				System.out.println("0 = exit, 1 = undo, 2 = draw all shapes, " +
						"3 = delete a shape, 4 = create circle, 5 = create rectangle");
				System.out.print("Enter option: ");
				String line = br.readLine();
				int option = Integer.parseInt(line);
				switch (option) {
					case 0:

					case 1:

						break;
					case 2:

						break;
					case 3:

						break;
					case 4:

						break;
					case 5:

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
