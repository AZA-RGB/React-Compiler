package AST;

public class VariableDeclarationExport implements ASTNode{

    VariableDeclaration variableDeclaration;

    public VariableDeclarationExport(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    @Override
    public String toString() {
        return "VariableDeclarationExport{\n"+ variableDeclaration +"}\n";
    }
}
