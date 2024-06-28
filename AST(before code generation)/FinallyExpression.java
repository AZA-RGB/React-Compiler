package AST;

import java.util.ArrayList;
import java.util.List;

public class FinallyExpression implements ASTNode{
    List<Statement> statements=new ArrayList<Statement>();
    String BreakOrContinue=null;
    String returnVal=null;

    public FinallyExpression(String breakOrContinue, String returnVal) {
        BreakOrContinue = breakOrContinue;
        this.returnVal = returnVal;
    }

    public void addStatement(Statement statement){
        this.statements.add(statement);
    }

    @Override
    public String toString() {
        String str="Finally{\n\t" +
                "statements :" + statements;

        if(BreakOrContinue!=null){
            str+=",\n\tBreakOrContinue : " + BreakOrContinue;
        }

        if(returnVal!=null){
            str+=",\n\treturnVal : " + returnVal ;
        }

        str+="}";

        return str;
    }
}
