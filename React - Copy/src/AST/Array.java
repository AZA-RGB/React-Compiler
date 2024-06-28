package AST;


import java.util.ArrayList;
import java.util.List;

public class Array extends ASTNode {
    public List<ArrayElement> ArrayElements=new ArrayList<>();
    public void addToElementList(ArrayElement e){
        ArrayElements.add(e);
    }

    @Override
    public String toString() {
        String result="ArrayDeclaration:{\n";
        for (ArrayElement e:this.ArrayElements) {
            result+='\t'+e.toString();
        }
        result+="}";
        return result;
    }

    @Override
    public String toJS() {
       StringBuilder ArrayCode=new StringBuilder();
       ArrayCode.append('[');
        for (int i = 0; i <ArrayElements.size() ; i++) {
            if(i==ArrayElements.size()-1){
                ArrayCode.append(ArrayElements.get(i).toJS());
            }else {
                ArrayCode.append(ArrayElements.get(i).toJS()).append(",");
            }
        }
        ArrayCode.append(']');
        return ArrayCode.toString();
    }
}