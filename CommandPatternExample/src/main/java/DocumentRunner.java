// Invoker
public class DocumentRunner {
    private FixedStack<Command> stack;

    public DocumentRunner() {
        this.stack = new FixedStack<>(3);
    }

    public void execute(final Command command) {
        stack.add(command);
        command.execute();
    }

    public void undo() {
        if (stack.isEmpty()) return;
        stack.pop().undo();
    }
}
