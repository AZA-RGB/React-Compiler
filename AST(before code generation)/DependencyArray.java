package AST;

import java.util.ArrayList;
import java.util.List;

public class DependencyArray implements  ASTNode{
    List<Identifier> identifierList=new ArrayList<>();
    public void addToIdentifierList(Identifier e){
        identifierList.add(e);
    }

    @Override
    public String toString() {
        return "DependencyArray{\n\t" +
                identifierList +
                '}';
    }
}
