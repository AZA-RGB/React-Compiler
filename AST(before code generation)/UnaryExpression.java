package AST;

public class UnaryExpression implements ASTNode{
    ASTNode leftSide;
    Operator operator;

    public UnaryExpression(ASTNode leftSide, Operator operator) {
        this.leftSide = leftSide;
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "UnaryExpression{\n" +
                "leftSide:" + leftSide +
                ",\n operator:" + operator +
                "\n},\n";
    }
}
