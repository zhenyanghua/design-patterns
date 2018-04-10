public class AndExpression implements Expression {
    Expression expression1;
    Expression expression2;

    public AndExpression(final Expression expression1, final Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(final String context) {
        return expression1.interpret(context) && expression2.interpret(context);
    }
}
