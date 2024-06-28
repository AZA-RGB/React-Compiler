package AST;

import java.util.ArrayList;
import java.util.List;

public class FunctionBody implements ASTNode{
    List<Statement> statements=new ArrayList<Statement>();
    ReturnStatement returnStatement=null;

    public void addStatement(Statement statement){
        this.statements.add(statement);
    }

    public FunctionBody(ReturnStatement returnStatement) {
        this.returnStatement = returnStatement;
    }
    public FunctionBody() {

    }
    @Override
    public String toString() {
        String result="functionBody: ";
        if(!statements.isEmpty()){
            result+="statements:[";
            for (Statement statement: statements) {
                 result+=statement;
            }
            result+="],\n";
        }
        if(returnStatement!=null){
            result+=returnStatement+"\n";
        }
        return result;
    }
}
