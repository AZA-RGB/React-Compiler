package AST;

import java.util.ArrayList;
import java.util.List;

public class WhileLoop implements  ASTNode{
    Conditions conditions=null;
    List<Statement> statements=new ArrayList<Statement>();
    String BreakOrContinue=null;
    String returnVal=null;

    public WhileLoop(String breakOrContinue,String returnVal,Conditions conditions) {
        BreakOrContinue = breakOrContinue;
        this.returnVal=returnVal;
        this.conditions=conditions;
    }

    public void addStatement(Statement statement){
        this.statements.add(statement);
    }


    @Override
    public String toString() {

        String str="WhileLoop{\n\t" +
                "conditions : " + conditions +
                ",\n\tstatements :" + statements;
        if(BreakOrContinue!=null){
            str+=",\n\tBreakOrContinue : " + BreakOrContinue;
        }
        if(returnVal!=null){
            str+=",\n\tReturnVal : " + returnVal;
        }
        str+="}";

        return str;
    }
}
