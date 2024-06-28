package AST;

import java.util.ArrayList;
import java.util.List;

public class JsxExpression extends ASTNode {
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

    @Override
    public String toJS() {
        StringBuilder jsxExpressionCode= new StringBuilder();
            for (ASTNode child : this.children) {
                if (child != null) {
//                    if (child instanceof SpreadOperation)
//                        jsxExpressionCode.append('{').append(child.toJS()).append('}');
//                    else
                        jsxExpressionCode.append(child.toJS());
                }
            }
        return jsxExpressionCode.toString();
    }

    public String toJS(boolean usedForCustomComponent) {
       StringBuilder jsxExpressionCode= new StringBuilder();
           for (ASTNode child:this.children) {
               if (child != null) {
                   if (child instanceof SpreadOperation)
                       jsxExpressionCode.append('{' + child.toJS() + '}');
                   else
                       jsxExpressionCode.append(child.toJS());
               }
           }
		return jsxExpressionCode.toString();
	}
}