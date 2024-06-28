package AST;

public class ExportStatement implements ASTNode{

    ASTNode export;

    public ExportStatement(ASTNode export) {
        this.export = export;
    }

    @Override
    public String toString() {
        return "ExportStatement{" + export +
                "}\n";
    }
}
