// Client
public class App {
    public static void main(String[] args) {
        Document document = new Document();
        DocumentRunner runner = new DocumentRunner();

        Command writeFirstLine = new WriteCommand(document,"First Line");
        Command writeSecondLine = new WriteCommand(document,"Second Line");
        Command writeThirdLine = new WriteCommand(document,"Third Line");
        Command writeFourthLine = new WriteCommand(document,"Fourth Line");
        Command writeFifthLine = new WriteCommand(document,"Fifth Line");

        System.out.println("----- After Write ------\n");

        runner.execute(writeFirstLine);
        runner.execute(writeSecondLine);
        runner.execute(writeThirdLine);
        runner.execute(writeFourthLine);
        runner.execute(writeFifthLine);

        System.out.println(document.toString());

        System.out.println("\n----- After Undo ------\n");

        runner.undo();
        runner.undo();
        runner.undo();
        runner.undo();
        runner.undo();
        runner.undo();

        System.out.println(document.toString());
    }
}
