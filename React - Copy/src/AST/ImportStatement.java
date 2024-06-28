package AST;

import java.util.ArrayList;
import java.util.List;

public class ImportStatement extends ASTNode  {
    List<ImportSpecifier> importSpecifiers=new ArrayList<>();
    String type;
    String source=null;

    public ImportStatement(String type) {
        this.type = type;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void addImportSpecifier(ImportSpecifier specifier) {
        this.importSpecifiers.add(specifier);
    }

    @Override
    public String toString() {
        return "ImportStatement{\n" +
                ",type:'" + type + '\'' +
                ",\n \t  importSpecifiers:\n" + importSpecifiers +
                "\n source:" + source +
                "\n}";
    }

	public String toJS() {
        StringBuilder importStatement = new StringBuilder("import ");

        if ("default".equals(type)) {
            if (!importSpecifiers.isEmpty()) {
                importStatement.append(importSpecifiers.get(0).toJS());
            }
        } else if ("namespace".equals(type)) {
            importStatement.append("* as ");
            if (!importSpecifiers.isEmpty()) {
                importStatement.append(importSpecifiers.get(0).toJS());
            }
        } else { // default to named imports
            importStatement.append("{ ");
            for (int i = 0; i < importSpecifiers.size(); i++) {
                importStatement.append(importSpecifiers.get(i).toJS());
                if (i < importSpecifiers.size() - 1) {
                    importStatement.append(", ");
                }
            }
            importStatement.append(" }");
        }
        if (source != null && !source.isEmpty()) {
            importStatement.append(" from ").append(source).append(";\n");
        } else {
            importStatement.append(";\n");
        }
        return importStatement.toString();
	}
}