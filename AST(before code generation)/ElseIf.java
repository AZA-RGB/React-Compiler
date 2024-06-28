package AST;

import java.util.ArrayList;
import java.util.List;

public class ElseIf implements ASTNode {
    Conditions conditions ;
    List<Statement> statements = new ArrayList<Statement>();

    String returnVal = null;

    String BreakOrContinue = null;

    public ElseIf(String breakOrContinue, String returnVal,Conditions conditions) {
        this.returnVal = returnVal;
        BreakOrContinue = breakOrContinue;
        this.conditions=conditions;
    }

    public void addStatement(Statement statement) {
        this.statements.add(statement);
    }


    @Override
    public String toString() {
        String str = "\n\telse if{\n\t" +
                "conditions : " + conditions +
                ",\n\tstatements :" + statements;
        if (BreakOrContinue != null) {
            str += ",\n\tBreakOrContinue : " + BreakOrContinue;
        }

        if (returnVal != null) {
            str += ",\n\treturnVal : " + returnVal;
        }
        str += "}";
        return str;
    }
}
