package AST;

public class CloseTag implements  ASTNode{
    String id;

    public CloseTag(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CloseTag{\n" +
                "\t\ttag_name:" + id +
                "\n}\n";
    }
}
