package Code;

import java.util.*;

public class UndoCommand implements Command {
    private Stack<Command> history;

    public UndoCommand(Stack<Command> history) {
        this.history = history;
    }

    public void execute() {
        if (!history.isEmpty()) {
            Command lastCommand = history.pop();
            lastCommand.undo();
        } else {
            System.out.println("Nothing to undo");
        }
    }

    public void undo() {
        // UndoCommand itself cannot be undone
    }
}
