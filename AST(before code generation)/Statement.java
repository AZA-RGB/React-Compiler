package AST;

public class Statement implements ASTNode{
    ASTNode value;

    public Statement(ASTNode value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "\n\tstatement:"+this.value;
    }
}
