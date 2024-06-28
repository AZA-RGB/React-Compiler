package AST;

import java.util.ArrayList;
import java.util.List;

public class TryExpression extends ASTNode {
    List<Statement> statements = new ArrayList<Statement>();
    String BreakOrContinue = null;
    ASTNode returnVal = null;
    ThrowExpression throwEx = null;

    FinallyExpression finallyExpression = null;

    CatchExpression catchExpression = null;

    public TryExpression(String breakOrContinue, ASTNode returnVal, ThrowExpression throwEx, FinallyExpression finallyExpression, CatchExpression catchExpression) {
        BreakOrContinue = breakOrContinue;
        this.returnVal = returnVal;
        this.throwEx = throwEx;
        this.finallyExpression = finallyExpression;
        this.catchExpression = catchExpression;
    }

    public void addStatement(Statement statement) {
        this.statements.add(statement);
    }

    @Override
    public String toString() {
        String str = "Try{" +
                "\n\tstatements :" + statements;

        if (BreakOrContinue != null) {
            str += ",\n\tBreakOrContinue : " + BreakOrContinue;
        }

        if (throwEx != null) {
            str += ",\n\tThrow : " + throwEx;
        }

        if (catchExpression != null) {
            str += ",\n\tCatch : " + catchExpression;
        }
        if (finallyExpression != null) {
            str += ",\n\tFinally : " + finallyExpression;
        }

        if (returnVal != null) {
            str += ",\n\treturnVal : " + returnVal;
        }

        str += "}";

        return str;
    }

    public String toJS() {
        StringBuilder statementCode = new StringBuilder();
        statementCode.append("try{\n");

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

        if (throwEx != null) {
            statementCode.append(throwEx.toJS()).append("\n");
        }


        if (returnVal != null) {
            statementCode.append(returnVal.toJS());
        }

        statementCode.append("}\n");

        if (catchExpression != null) {
            statementCode.append(catchExpression.toJS());
        }

        if (finallyExpression != null) {
            statementCode.append(finallyExpression.toJS());
        }

        return statementCode.toString();
    }

}