package AST;

import java.util.ArrayList;
import java.util.List;

public class ForLoop extends ASTNode {

    Conditions conditions;
    List<Statement> statements = new ArrayList<Statement>();
    String BreakOrContinue = null;
    ASTNode returnVal = null;
    ASTNode variableDeclaration = null;
    ASTNode expression = null;

    public ForLoop(String breakOrContinue, ASTNode returnVal, ASTNode variableDeclaration, ASTNode expression, Conditions conditions) {
        BreakOrContinue = breakOrContinue;
        this.returnVal = returnVal;
        this.variableDeclaration = variableDeclaration;
        this.expression = expression;
        this.conditions = conditions;
    }

    public void addStatement(Statement statement) {
        this.statements.add(statement);
    }


    @Override
    public String toString() {

        String str = "ForLoop{\n\t" +
                "conditions : " + conditions +
                ",\n\tvariableDeclaration : " + variableDeclaration +
                ",\n\texpression : " + expression +
                ",\n\tstatements : " + statements;

        if (BreakOrContinue != null) {
            str += ",\n\tBreakOrContinue : " + BreakOrContinue;
        }

        if (returnVal != null) {
            str += ",\n\treturnVal : " + returnVal;
        }
        str += '}';
        return str;
    }

    public String toJS() {
        StringBuilder statementCode = new StringBuilder();
        statementCode.append("for(");

        if (variableDeclaration != null) {
            statementCode.append(variableDeclaration.toJS());

        }
        statementCode.append(" ; ");

        if (conditions != null) {
            statementCode.append(conditions.toJS());

        }
        statementCode.append(" ; ");

        if (expression != null) {
            statementCode.append(expression.toJS());

        }
        statementCode.append("){\n");

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
        statementCode.append("}");
        return statementCode.toString();
    }
}