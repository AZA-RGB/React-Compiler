package AST;

public class Expression implements ASTNode {
    private ASTNode leftExpression;
    private ASTNode rightExpression;
    private Operator operator;  // The binary operator (+, -, *, /, etc.)

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public void setLeftExpression(ASTNode leftExpression) {
        this.leftExpression = leftExpression;
    }

    public void setRightExpression(ASTNode rightExpression) {
        this.rightExpression = rightExpression;
    }

    @Override
    public String toString() {
        return "Expression:" + formatExpression(this, 0) + "\n";
    }

    private String formatExpression(ASTNode expression, int depth) {
        String indentation = "\t";
        if (expression instanceof Literal || expression instanceof Identifier||expression instanceof MemberExpression) {
            return expression.toString() ;
        } else if (expression instanceof Expression) {
            Expression exp = (Expression) expression;
            String result ="{\n";
            result += indentation + "left:" + formatExpression(exp.leftExpression, depth + 1)+"\n";
            result += indentation + exp.operator;
            result += indentation + "right:" + formatExpression(exp.rightExpression, depth + 1);
            result +=  "},";
            return result;
        } else {
            return "Unknown Expression Type";
        }
    }
}
