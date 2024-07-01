package AST;

import java.util.Objects;

public class WildCardImport extends ASTNode{
    Identifier id =null;
    String source;

    public WildCardImport(Identifier id, String source) {
        this.id = id;
        this.source = source;
    }

    @Override
    public String toString() {
        return "wild card import ";
    }

    @Override
    public String toJS() {
        if(Objects.equals(source, "'react'")) return"";
        return "import * as "+id.toJS()+" from "+source;
    }
}
