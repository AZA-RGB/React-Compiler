package AST;

import java.util.ArrayList;
import java.util.List;

public class TernaryExpression extends ASTNode {
    Conditions conditions = null;

    TernaryExpression ternaryExpression = null;
    List<Statement> statements = new ArrayList<Statement>();

    public TernaryExpression(TernaryExpression ternaryExpression) {
        this.ternaryExpression = ternaryExpression;
    }

    public void addStatement(Statement statement) {
        this.statements.add(statement);
    }

    public void setConditions(Conditions conditions) {
        this.conditions = conditions;
    }

    @Override
    public String toString() {
        String str = "TernaryExpression {\n\t" +
                "conditions: " + conditions;
        if (ternaryExpression != null) {
            str += ",\n\tternaryExpression : " + ternaryExpression;
        }
        str += ",\n\tstatements :" + statements +
                '}';
        return str;
    }

    public String toJS() {
        StringBuilder statementCode = new StringBuilder();
        statementCode.append(conditions.toJS());
        if (statements != null && !statements.isEmpty()) {
            for (int i = 0; i < statements.size(); i++) {
                if (i % 2 == 0) {
                    statementCode.append("? ( " + statements.get(i).toJS() + " )");
                } else {
                    statementCode.append(": ( " + statements.get(i).toJS() + " )");

                }
            }
        }

        return statementCode.toString();
    }
}