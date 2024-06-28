package AST;

public class ReturnStatement implements ASTNode{
    ASTNode value;

    public ReturnStatement(ASTNode value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "returnStatement:argument:\n"+this.value;
    }
}
