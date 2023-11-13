package Code;

public interface Command {

    public abstract void exit();

    public abstract void undo();

    public abstract void execute();
}
