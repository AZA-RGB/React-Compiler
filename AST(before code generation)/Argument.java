package AST;

public class Argument implements  ASTNode{
    ASTNode value;

    public Argument(ASTNode value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
