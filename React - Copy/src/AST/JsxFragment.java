package AST;

import java.util.ArrayList;
import java.util.List;

public class JsxFragment extends ASTNode {
    List<Object> children=new ArrayList<>();
    public void addChild(Object child){
        this.children.add(child);
    }
    @Override
    public String toString() {
        String result="jsx_fragment{" +
                "children:[\n";
        for (Object child:children) {
            if(child instanceof String){
                result+="jsxText:"+ child ;
            }   else{
                result+=child.toString();
            }
        }
        result  +="],\n "+'}';
        return  result;
    }


	public String toJS() {
        StringBuilder jsxFragmentCode= new StringBuilder();
        jsxFragmentCode.append("<div>");
        for (Object child:this.children) {
            if(child!=null)
                if(child instanceof String){
                    jsxFragmentCode.append("\n").append(child);
                } else if (child instanceof ASTNode ) {
                    jsxFragmentCode.append("\n").append(((ASTNode) child).toJS());
                }
        }

        jsxFragmentCode.append(" </div>");


		return jsxFragmentCode.toString();
	}
}