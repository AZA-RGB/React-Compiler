package AST;

import java.util.ArrayList;
import java.util.List;

public class FinallyExpression extends ASTNode {
    List<Statement> statements=new ArrayList<Statement>();
    String BreakOrContinue=null;
    ASTNode returnVal=null;

    public FinallyExpression(String breakOrContinue, ASTNode returnVal) {
        BreakOrContinue = breakOrContinue;
        this.returnVal = returnVal;
    }

    public void addStatement(Statement statement){
        this.statements.add(statement);
    }

    @Override
    public String toString() {
        String str="Finally{\n\t" +
                "statements :" + statements;

        if(BreakOrContinue!=null){
            str+=",\n\tBreakOrContinue : " + BreakOrContinue;
        }

        if(returnVal!=null){
            str+=",\n\treturnVal : " + returnVal ;
        }

        str+="}";

        return str;
    }

    public String toJS() {
        StringBuilder statementCode = new StringBuilder();
        statementCode.append("finally{\n");

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