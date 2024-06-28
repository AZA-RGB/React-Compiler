package AST;

public class VariableDeclarationKeyword implements ASTNode{
    String value;

    public VariableDeclarationKeyword(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "variableDeclarationKeyword:"+this.value;
    }
}
