package AST;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DestructuredImport extends ASTNode{
String source="";

    List<ImportSpecifier> importSpecifiers=new ArrayList<>();

    public DestructuredImport(String source) {
        this.source = source;
    }

    public void addImportSpecifier(ImportSpecifier importSpecifier){
        importSpecifiers.add(importSpecifier);
    }

    @Override
    public String toString() {
        return "destructured import ";
    }

    @Override
    public String toJS() {
        StringBuilder importSpecifiersCode=new StringBuilder();
        if(Objects.equals(source, "'react'")) return"";
        importSpecifiersCode.append("{ ");
        for (int i = 0; i < importSpecifiers.size(); i++) {
            importSpecifiersCode.append(importSpecifiers.get(i).toJS());
            if (i < importSpecifiers.size() - 1) {
                importSpecifiersCode.append(", ");
            }
        }
        importSpecifiersCode.append(" }");

        return "import "+ importSpecifiersCode +" from "+source;
    }
}
