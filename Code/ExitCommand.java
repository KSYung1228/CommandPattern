package Code;

public class ExitCommand implements Command {
    @Override
    public void exit() {
        System.out.println("-- End --");
        System.exit(0);
    }

    @Override
    public void undo() {
        // Nothing to do
    }

    @Override
    public void execute() {
        // Nothing to do
    }
}
