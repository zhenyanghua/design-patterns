import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Receiver
public class Document {
    private List<String> content = new ArrayList<>();

    /**
     * Write a line to the content
     * @param line a line of string
     * @return the line number (1 indexed)
     */
    public int writeLine(String line) {
        content.add(line);
        return content.size();
    }

    /**
     * Delete a line with the given line number
     * @param lineNumber the line number (1 indexed)
     */
    public void deleteLine(int lineNumber) {
        if (lineNumber <= 0) return;
        content.remove(lineNumber - 1);
    }

    @Override
    public String toString() {
        return content.stream().collect(Collectors.joining("\n"));
    }
}
