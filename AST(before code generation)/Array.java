package AST;


import java.util.ArrayList;
import java.util.List;

public class Array implements ASTNode{
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
}
