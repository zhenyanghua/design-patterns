// Client
public class App {
    public static void main(String[] args) {
        Document document1 = new Document();
        Document document2 = new Document();

        Command writeFirstLine = new WriteCommand(document1,"First Line in Document 1");
        Command writeSecondLine = new WriteCommand(document1,"Second Line in Document 1");
        Command writeThirdLine = new WriteCommand(document1,"Third Line in Document 1");

        Command writeFirstLine2 = new WriteCommand(document2,"First Line in Document 2");
        Command writeSecondLine2 = new WriteCommand(document2,"Second Line in Document 2");

        Mediator mediator = new Mediator();
        mediator.registerDocument(document1);
        mediator.registerDocument(document2);

        Command signAll = new SignAllCommand(mediator);

        DocumentRunner runner = new DocumentRunner(1);

        System.out.println("----- After Write ------\n");

        runner.execute(writeFirstLine);
        runner.execute(writeSecondLine);
        runner.execute(writeThirdLine);

        runner.execute(writeFirstLine2);
        runner.execute(writeSecondLine2);

        runner.execute(signAll);

        System.out.println(document1.toString());
        System.out.println(document2.toString());

        System.out.println("\n----- After Undo ------\n");

        runner.undo();
        runner.undo();
        runner.undo();
        runner.undo();
        runner.undo();
        runner.undo();

        System.out.println(document1.toString());
        System.out.println(document2.toString());
    }
}
