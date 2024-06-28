package AST;

import java.util.ArrayList;
import java.util.List;

public class ImportStatement implements ASTNode {
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
}
