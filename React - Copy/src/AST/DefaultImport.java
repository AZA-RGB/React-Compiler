package AST;

import java.util.Objects;

public class DefaultImport extends ASTNode{
ImportSpecifier imported=null;
String source="";

    public DefaultImport(ImportSpecifier imported, String source) {
        this.imported = imported;
        this.source = source;
    }

    @Override
    public String toString() {
        return "defaultImport:{\nimported:"+
                imported+"\n soouce:"+source
                +"}";
    }

    @Override
    public String toJS() {
        if(Objects.equals(source, "'react'")) return"";
        return "import "+imported.toJS()+" from "+source;
    }
}
