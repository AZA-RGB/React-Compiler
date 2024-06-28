package AST;

import java.util.ArrayList;
import java.util.List;

public class Else implements ASTNode {
    List<Statement> statements = new ArrayList<Statement>();
    String BreakOrContinue = null;
    String returnVal = null;

    public Else(String breakOrContinue, String returnVal) {
        this.returnVal = returnVal;
        BreakOrContinue = breakOrContinue;
    }

    public void addStatement(Statement statement) {
        this.statements.add(statement);
    }


    @Override
    public String toString() {
        String str = "else{\n\t" +
                "statements :" + statements;

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
