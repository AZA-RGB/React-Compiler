package AST;

import java.util.ArrayList;
import java.util.List;

public class If implements ASTNode {
    Conditions conditions =null;
    List<Statement> statements = new ArrayList<Statement>();
    List<ElseIf> elseIfs = new ArrayList<ElseIf>();

    Else els = null;
    String returnVal = null;

    String BreakOrContinue = null;

    public If(String breakOrContinue, String returnVal,Conditions conditions) {
        this.returnVal = returnVal;
        BreakOrContinue = breakOrContinue;
        this.conditions=conditions;

    }

    public void addStatement(Statement statement) {
        this.statements.add(statement);
    }


    public void setElse(Else els) {
        this.els = els;
    }

    public void addElseIf(ElseIf elseIf) {
        elseIfs.add(elseIf);
    }

    @Override
    public String toString() {

        String str = "if{\n\t" +
                "conditions : " + conditions +
                ",\n\tstatements :" + statements;
        if (BreakOrContinue != null) {
            str += ",\n\tBreakOrContinue : " + BreakOrContinue;
        }

        if (returnVal != null) {
            str += ",\n\treturnVal : " + returnVal;
        }

        str += "}";
        if (!elseIfs.isEmpty()) {
            str += ",\n\telse if : " + elseIfs + ",\n\t";
        }

        if (els != null) {
            str += "else : " + els + "\n\t";
        }
        return str;
    }
}
