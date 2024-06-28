package AST;

import java.util.ArrayList;
import java.util.List;

public class CatchExpression implements  ASTNode{

    List<Statement> statements=new ArrayList<Statement>();

    String BreakOrContinue=null;
    Identifier argument=null;

    String returnVal=null;

    public CatchExpression(String breakOrContinue,Identifier argument, String returnVal) {
        BreakOrContinue = breakOrContinue;
        this.argument = argument;
        this.returnVal = returnVal;
    }

    public void addStatement(Statement statement){
        this.statements.add(statement);
    }


    @Override
    public String toString() {
        String str="Catch{" +
                "\n\tstatements :" + statements;

        if(BreakOrContinue!=null){
            str+=",\n\tBreakOrContinue : " + BreakOrContinue;
        }

        if(argument!=null){
            str+=",\n\tArgument : " + argument;
        }

        if(returnVal!=null){
            str+=",\n\treturnVal : " + returnVal ;
        }

        str+="}";

        return str;
    }
}
