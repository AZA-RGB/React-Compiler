package AST;

public class ThrowExpression extends  ASTNode{
    ASTNode statement=null;

    public ThrowExpression(ASTNode statement) {
        this.statement = statement;
    }

    @Override
    public String toString() {
        return "ThrowExpression{" +
                 statement +
                "\n\t}";
    }

	public String toJS() {
		return contextText;
	}
}