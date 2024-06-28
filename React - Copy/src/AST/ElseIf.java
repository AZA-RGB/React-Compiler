package AST;

import java.util.ArrayList;
import java.util.List;

public class ElseIf extends ASTNode  {
    Conditions conditions ;
    List<Statement> statements = new ArrayList<Statement>();

    ASTNode returnVal = null;

    String BreakOrContinue = null;

    public ElseIf(String breakOrContinue, ASTNode returnVal,Conditions conditions) {
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

    public String toJS() {
        StringBuilder statementCode = new StringBuilder();
        statementCode.append("else if("+conditions.toJS()+"){\n");

        if (statements != null && !statements.isEmpty()) {
            for (int i = 0; i < statements.size(); i++) {
                if (i == statements.size() - 1) {
                    statementCode.append(statements.get(i).toJS());
                } else {
                    statementCode.append(statements.get(i).toJS()).append("\n");

                }            }
        }

        if (BreakOrContinue != null) {
            statementCode.append(BreakOrContinue).append("\n");
        }

        if (returnVal != null) {
            statementCode.append(returnVal.toJS()).append("\n");
        }
        statementCode.append("\n}");

        return statementCode.toString();
    }
}