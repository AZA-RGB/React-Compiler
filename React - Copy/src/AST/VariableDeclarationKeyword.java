package AST;

public class VariableDeclarationKeyword extends ASTNode {
    String value;

    public VariableDeclarationKeyword(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "variableDeclarationKeyword:"+this.value;
    }

	public String toJS() {
		return value;
	}
}