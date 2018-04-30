public class SignAllCommand implements Command {
    private Mediator mediator;

    public SignAllCommand(final Mediator mediator) {
        this.mediator = mediator;
    }


    @Override
    public void execute() {
        mediator.signAllDocuments();
    }

    @Override
    public void undo() {
        mediator.unsignAllDocuments();
    }
}
