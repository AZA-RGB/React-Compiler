package AST;

import java.util.ArrayList;
import java.util.List;

public class JsxExpression implements ASTNode{
    List<ASTNode> children=new ArrayList<>();

    public void addChild(ASTNode child){
        this.children.add(child);
    }

    @Override
    public String toString() {
       String result= "JsxExpression{";
        for (ASTNode child:this.children) {
            if(child!=null)
            result+=child;
        }
        result+="}";
        return result;
    }
}
