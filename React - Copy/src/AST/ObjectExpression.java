package AST;

public class ObjectExpression extends ASTNode {
    ASTNode value;

    public ObjectExpression(ASTNode value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }

	public String toJS() {
		return value.toJS();
	}
}