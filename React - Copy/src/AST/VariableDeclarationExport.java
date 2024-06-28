package AST;

public class VariableDeclarationExport extends ASTNode {

    VariableDeclaration variableDeclaration;

    public VariableDeclarationExport(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    @Override
    public String toString() {
        return "VariableDeclarationExport{\n"+ variableDeclaration +"}\n";
    }

	public String toJS() {
		return "export "+ variableDeclaration.toJS();
	}
}