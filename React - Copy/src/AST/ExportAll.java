package AST;

public class ExportAll extends ASTNode {
    ExportSpecifier exportSpecifier;
    String  source;

    public void setExportSpecifier(ExportSpecifier exportSpecifier) {
        this.exportSpecifier = exportSpecifier;
    }

    public void setSource(String source) {
        this.source = source;
    }




	public String toJS() {
        StringBuilder exportAllStatement = new StringBuilder("export *");

        if (exportSpecifier != null) {
            exportAllStatement.append(" as ").append(exportSpecifier.toJS());
        }

        if (source != null && !source.isEmpty()) {
            exportAllStatement.append(" from '").append(source).append("';");
        } else {
            exportAllStatement.append(";");
        }

        return exportAllStatement.toString();
	}
}