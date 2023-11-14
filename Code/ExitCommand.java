public class ExitCommand implements Command {
    @Override
    public void execute() {
        System.out.println("-- End --");
        System.exit(0);
    };
}
