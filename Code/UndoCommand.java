package Code;

import java.util.Stack;

public class UndoCommand implements Command {
    public Stack<Action> history;
    public Shape shapes;

    @Override
    public void exit() {
        // Nothing to do
    }

    @Override
    public void undo() {
    }

    @Override
    public void execute() {
        // Nothing to do
    }

}
