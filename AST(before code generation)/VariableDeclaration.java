package AST;

import java.util.ArrayList;
import java.util.List;

public class VariableDeclaration implements ASTNode{
    VariableDeclarationKeyword keyword;
    List<VariableDeclarator> variableDeclarator=new ArrayList<>();
    public void addVariableDeclarator(VariableDeclarator variableDeclarator){
        this.variableDeclarator.add(variableDeclarator);
    }

    public VariableDeclaration(VariableDeclarationKeyword keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
       String result="variableDeclaration:{\n";
       result+="\t"+this.keyword+",\n";
        for (VariableDeclarator vbr:this.variableDeclarator) {
            result += vbr.toString();
        }
        return result+"\n}\n";
    }
}
