package AST;

import java.util.ArrayList;
import java.util.List;

public class NormalJsxElement implements ASTNode {
    List<Object> children=new ArrayList<>();
    OpenTag openTag;
    CloseTag closeTag;


    public NormalJsxElement(OpenTag openTag, CloseTag closeTag) {
        this.openTag = openTag;
        this.closeTag = closeTag;
    }

    public void addChild(Object child){
        this.children.add(child);
    }
    @Override
    public String toString() {
        String result="NormalJsxElement{" +openTag +",\n "+
                "children:[\n";
        for (Object child:children) {
             if(child instanceof String){
                 result+="jsxText:"+ child ;
             }   else{
                 result+=child.toString();
             }
        }
              result  +="],\n "+closeTag +'}';
        return  result;
    }
}
