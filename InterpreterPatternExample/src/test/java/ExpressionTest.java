import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ExpressionTest {

    static Expression text1;
    static Expression text2;
    static Expression text3;

    @BeforeClass
    public static void setup() {
        text1 = new TextExpression("Foo");
        text2 = new TextExpression("Bar");
        text3 = new TextExpression("Zoo");
    }

    @Test
    public void expressionShouldContainTokenizedString() {
        String context = "This is foo bar";
        assertTrue(text1.interpret(context));
    }

    @Test
    public void expressionShouldNotContainSubString() {
        String context = "This is foobar";
        assertFalse(text1.interpret(context));
    }

    @Test
    public void andExpressionShouldRequireBothToBeScucess() {
        String context = "This is Foo Bar. Zoo";
        assertFalse(new AndExpression(text1, text2).interpret(context));
        assertTrue(new AndExpression(text1, text3).interpret(context));
    }

    @Test
    public void orExpressionShouldNeedAnyOneToBeSuccess() {
        String context = "This is Foo Bar. Zoo";
        assertTrue(new OrExpression(text1, text2).interpret(context));
        assertTrue(new OrExpression(text1, text3).interpret(context));
        assertTrue(new OrExpression(
            new AndExpression(text1, text2),
            new OrExpression(text1, text2))
            .interpret(context));
        assertFalse(new OrExpression(
            new AndExpression(text1, text2),
            new AndExpression(text2, text3))
            .interpret(context));
    }
}
