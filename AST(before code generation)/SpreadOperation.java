package AST;

public class SpreadOperation implements ASTNode{
    ASTNode argument;

    public SpreadOperation(ASTNode argument) {
        this.argument = argument;
    }

    @Override
    public String toString() {
        return "SpreadOperation{\n" +
                "argument:" + argument +
                "\n}\n";
    }
}
