package AST;

import java.util.ArrayList;
import java.util.List;

public class DoWhileLoop extends ASTNode {
    Conditions conditions;
    List<Statement> statements = new ArrayList<Statement>();
    String BreakOrContinue = null;
    ASTNode returnVal = null;

    public DoWhileLoop(String breakOrContinue, ASTNode returnVal, Conditions conditions) {
        BreakOrContinue = breakOrContinue;
        this.returnVal = returnVal;
        this.conditions = conditions;
    }

    public void addStatement(Statement statement) {
        this.statements.add(statement);
    }


    @Override
    public String toString() {

        String str = "Do While Loop{\n\t" +
                "conditions : " + conditions +
                ",\n\tstatements :" + statements;
        if (BreakOrContinue != null) {
            str += ",\n\tBreakOrContinue : " + BreakOrContinue;
        }
        if (returnVal != null) {
            str += ",\n\tReturnVal : " + returnVal;
        }
        str += "}";

        return str;
    }

    public String toJS() {
        StringBuilder statementCode = new StringBuilder();
        statementCode.append("do{\n");

        if (statements != null && !statements.isEmpty()) {
            for (int i = 0; i < statements.size(); i++) {

                if (i == statements.size() - 1) {
                    statementCode.append(statements.get(i).toJS());
                } else {
                    statementCode.append(statements.get(i).toJS()).append("\n");

                }
            }
        }

        if (BreakOrContinue != null) {
            statementCode.append(BreakOrContinue).append("\n");
        }

        if (returnVal != null) {
            statementCode.append(returnVal.toJS());
        }
        statementCode.append("}while(" + conditions.toJS() + ")");
        return statementCode.toString();
    }
}