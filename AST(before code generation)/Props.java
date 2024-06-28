package AST;

public class Props implements ASTNode{
    private final ASTNode value;//null/objectliteral/id

    public Props(ASTNode value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "props:{\n\t" + (this.value != null ? this.value.toString() : "null") + "\n\t},";
    }


}
