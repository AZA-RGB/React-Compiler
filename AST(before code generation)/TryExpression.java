package AST;

import java.util.ArrayList;
import java.util.List;

public class TryExpression implements ASTNode{
    List<Statement> statements=new ArrayList<Statement>();
    String BreakOrContinue=null;
    String returnVal=null;
    ThrowExpression throwEx=null;

    FinallyExpression finallyExpression=null;

    CatchExpression catchExpression=null;

    public TryExpression(String breakOrContinue, String returnVal, ThrowExpression throwEx, FinallyExpression finallyExpression, CatchExpression catchExpression) {
        BreakOrContinue = breakOrContinue;
        this.returnVal = returnVal;
        this.throwEx = throwEx;
        this.finallyExpression = finallyExpression;
        this.catchExpression = catchExpression;
    }

    public void addStatement(Statement statement){
        this.statements.add(statement);
    }

    @Override
    public String toString() {
        String str="Try{" +
                "\n\tstatements :" + statements;

        if(BreakOrContinue!=null){
            str+=",\n\tBreakOrContinue : " + BreakOrContinue;
        }

        if(throwEx!=null){
            str+=",\n\tThrow : " + throwEx;
        }

        if(catchExpression!=null){
            str+=",\n\tCatch : " + catchExpression;
        }
        if(finallyExpression!=null){
            str+=",\n\tFinally : " + finallyExpression;
        }


        if(returnVal!=null){
            str+=",\n\treturnVal : " + returnVal ;
        }

        str+="}";

        return str;
    }
}
