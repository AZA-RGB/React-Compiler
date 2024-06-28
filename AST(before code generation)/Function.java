package AST;

public class Function implements  ASTNode{
String type;
ASTNode function;

    public Function(String type, ASTNode function) {
        this.type = type;
        this.function = function;
    }

    @Override
    public String toString() {
        return "Function:{" +
                "type:" + this.type + ",\n" +
                "\t " + this.function +
                '}';
    }
}
