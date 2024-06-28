package AST;

import java.util.ArrayList;
import java.util.List;

public class ForLoop implements  ASTNode{

    Conditions conditions;
    List<Statement> statements=new ArrayList<Statement>();
    String BreakOrContinue=null;
    String returnVal=null;
    ASTNode variableDeclaration=null;
    Expression expression=null;

    public ForLoop(String breakOrContinue, String returnVal, ASTNode variableDeclaration, Expression expression,Conditions conditions) {
        BreakOrContinue = breakOrContinue;
        this.returnVal = returnVal;
        this.variableDeclaration = variableDeclaration;
        this.expression = expression;
        this.conditions=conditions;
    }

    public void addStatement(Statement statement){
        this.statements.add(statement);
    }


    @Override
    public String toString() {

        String str="ForLoop{\n\t" +
                "conditions : " + conditions +
                ",\n\tvariableDeclaration : " + variableDeclaration  +
                ",\n\texpression : " + expression +
                ",\n\tstatements : " + statements ;

        if(BreakOrContinue!=null){
          str+=  ",\n\tBreakOrContinue : " + BreakOrContinue ;
        }

        if(returnVal!=null){
            str+=",\n\treturnVal : " + returnVal ;
        }
        str+='}';
        return  str;
    }
}
