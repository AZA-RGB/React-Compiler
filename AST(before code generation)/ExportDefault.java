package AST;

public class ExportDefault implements ASTNode{
ASTNode exported;

    public void setExported(ASTNode exported) {
        this.exported = exported;
    }

    @Override
    public String toString() {
        return "ExportDefault{\n" +
                "exported:" + exported +
                "\n}\n";
    }
}
