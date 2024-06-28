package AST;

import java.util.ArrayList;
import java.util.List;

public class SelfClosingTag implements ASTNode{
    String id;
    List<ASTNode> jsxAttributes=new ArrayList<>();

    public SelfClosingTag(String id) {
        this.id = id;
    }
    public void addJsxAttribute(ASTNode attribute){
        this.jsxAttributes.add(attribute);
    }

    @Override
    public String toString() {
        return "SelfClosingTag{" +
                "id:" + id +
                "\n, jsxAttributes" + jsxAttributes +",\n"+
                "},\n";
    }

}
