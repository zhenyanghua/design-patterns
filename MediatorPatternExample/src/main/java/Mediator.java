import java.util.ArrayList;
import java.util.List;

public class Mediator {
    List<Document> documents = new ArrayList<>();

    public void registerDocument(Document document) {
        documents.add(document);
    }

    public void signAllDocuments() {
        documents.forEach(document -> document.writeLine("Signed"));
    }

    public void unsignAllDocuments() {
        documents.stream()
            .filter(document -> document.getTotalLineNumber() > 0)
            .filter(document -> document.peek().equalsIgnoreCase("Signed"))
            .forEach(document -> document.deleteLine(document.getTotalLineNumber()));
    }
}
