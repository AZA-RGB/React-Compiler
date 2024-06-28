package AST;

import java.util.ArrayList;
import java.util.List;

public class If extends ASTNode {
    Conditions conditions = null;
    List<Statement> statements = new ArrayList<Statement>();
    List<ElseIf> elseIfs = new ArrayList<ElseIf>();

    Else els = null;
    ASTNode returnVal = null;

    String BreakOrContinue = null;

    public If(String breakOrContinue, ASTNode returnVal, Conditions conditions) {
        this.returnVal = returnVal;
        BreakOrContinue = breakOrContinue;
        this.conditions = conditions;

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

        String str = "if{\n\t" + "conditions : " + conditions + ",\n\tstatements :" + statements;
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

    public String toJS() {
        StringBuilder statementCode = new StringBuilder();
        statementCode.append("if(" + conditions.toJS() + "){\n");

        if (statements != null && !statements.isEmpty()) {
            for (int i = 0; i < statements.size(); i++) {
                if (i == statements.size() - 1) {
                    statementCode.append(statements.get(i).toJS());
                } else {
                    statementCode.append(statements.get(i).toJS());

                }
            }
        }

        if (BreakOrContinue != null) {
            statementCode.append(BreakOrContinue);
        }

        if (returnVal != null) {
            statementCode.append(returnVal.toJS());
        }
        statementCode.append("}");
        if (elseIfs != null && !elseIfs.isEmpty()) {
            for (int i = 0; i < elseIfs.size(); i++) {
                statementCode.append(elseIfs.get(i).toJS());
            }
        }
        if (els != null) {
            statementCode.append(els.toJS()).append("\n");
        }

        return statementCode.toString();
    }
}