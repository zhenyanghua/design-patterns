import java.util.Arrays;

public class TextExpression implements Expression{
    private String text;

    public TextExpression(final String text) {
        this.text = text;
    }

    @Override
    public boolean interpret(final String context) {
        return Arrays.stream(context.split(" "))
            .anyMatch(s -> s.equalsIgnoreCase(text));

    }
}
