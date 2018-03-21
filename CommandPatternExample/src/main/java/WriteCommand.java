// ConcreteCommand
public class WriteCommand implements Command{
    private Document document;
    private String line;
    private int lineNumber;

    public WriteCommand(final Document document, final String line) {
        this.document = document;
        this.line = line;
    }

    @Override
    public void execute() {
        lineNumber = document.writeLine(this.line);
    }

    @Override
    public void undo() {
        document.deleteLine(lineNumber);
    }
}
