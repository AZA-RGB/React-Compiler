package AST;

public class ExportStatement extends ASTNode {

    ASTNode export;

    public ExportStatement(ASTNode export) {
        this.export = export;
    }

    @Override
    public String toString() {
        return "ExportStatement{" + export +
                "}\n";
    }

	public String toJS() {
        if (export != null) {
            return export.toJS();
        } else {
            return "";
        }
	}
}