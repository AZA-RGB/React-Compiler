package AST;

import java.util.ArrayList;
import java.util.List;

public class JsxFragment implements ASTNode{
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

}
