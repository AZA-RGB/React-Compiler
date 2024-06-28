package AST;

public class ObjectExpression implements ASTNode{
    ASTNode value;

    public ObjectExpression(ASTNode value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
