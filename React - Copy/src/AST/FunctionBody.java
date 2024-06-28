package AST;

import java.util.ArrayList;
import java.util.List;

public class FunctionBody extends ASTNode {
    List<Statement> statements= new ArrayList<>();
    ReturnStatement returnStatement=null;

    public void addStatement(Statement statement){
        this.statements.add(statement);
    }

    public FunctionBody(ReturnStatement returnStatement) {
        this.returnStatement = returnStatement;
    }
    public FunctionBody() {

    }
    public void setReturnStatement(ReturnStatement returnStatement) {
        this.returnStatement = returnStatement;
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

    public String toJS() {
        StringBuilder FunctionBodyCode=new StringBuilder();
        if(!statements.isEmpty()) {
            for (Statement stmt :statements) FunctionBodyCode.append(stmt.toJS()).append("\n");
        }
        if(returnStatement!=null) {
            FunctionBodyCode.append(returnStatement.toJS());
        }
        return FunctionBodyCode.toString();
    }
}