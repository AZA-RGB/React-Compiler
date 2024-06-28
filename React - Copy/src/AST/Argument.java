package AST;

public class Argument extends  ASTNode{
    ASTNode value;

    public Argument(ASTNode value) {
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