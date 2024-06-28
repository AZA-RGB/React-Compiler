package AST;

import java.util.ArrayList;
import java.util.List;

public class OpenTag implements ASTNode{
    String id;
   List<ASTNode> jsxAttributes=new ArrayList<>();

    public OpenTag(String id) {
        this.id = id;
    }
    public void addJsxAttribute(ASTNode attribute){
        this.jsxAttributes.add(attribute);
    }

    @Override
    public String toString() {
        return "\n\tOpenTag{\n" +
                "\t\ttag_name:" + id +
                ",\n\t\tjsxAttributes" + jsxAttributes +"\n"+
        "}\n";
    }
}
