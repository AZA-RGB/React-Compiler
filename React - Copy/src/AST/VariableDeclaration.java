package AST;

import java.util.ArrayList;
import java.util.List;

public class VariableDeclaration extends ASTNode {
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

	public String toJS() {
		StringBuilder variableDeclarationCode=new StringBuilder();
        if (this.keyword!=null){
            variableDeclarationCode.append(keyword.toJS()).append(" ");
        }
        if(variableDeclarator.size()>1){
            for (int i = 0; i < variableDeclarator.size(); i++) {
                if(i==variableDeclarator.size()-1){
                    variableDeclarationCode.append(variableDeclarator.get(i).toJS());
                }
                else{
                    variableDeclarationCode.append(variableDeclarator.get(i).toJS()).append(",");
                }
            }
        }
        else {
            variableDeclarationCode.append(variableDeclarator.get(0).toJS());
        }
    return variableDeclarationCode.toString();
	}
}