package AST;

public class ExportDefault extends ASTNode {
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

	public String toJS() {
        if (exported != null) {
            return "export default " + exported.toJS() + ";";
        } else {
            return "export default;";
        }
	}
}