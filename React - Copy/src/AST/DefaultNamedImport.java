package AST;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DefaultNamedImport extends ASTNode{

    List<ImportSpecifier> importSpecifiers=new ArrayList<>();
    String source="";


    public DefaultNamedImport(String source) {
        this.source = source;
    }

    public void addImportSpecifier(ImportSpecifier importSpecifier){
        importSpecifiers.add(importSpecifier);
    }


    @Override
    public String toString() {
        return "Default and named import:{\nthe default:{"+importSpecifiers.remove(0)+"}\n the named:"+importSpecifiers+"source:"+source;
    }

    @Override
    public String toJS() {
        if(Objects.equals(source, "'react'")) return"";
        StringBuilder importSpecifiersCode=new StringBuilder();
        importSpecifiersCode.append(importSpecifiers.remove(0).toJS()).append(',');
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
















