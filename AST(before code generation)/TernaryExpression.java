package AST;

import java.util.ArrayList;
import java.util.List;

public class TernaryExpression implements  ASTNode{
    Conditions conditions=null;

    TernaryExpression ternaryExpression=null;
    List<Statement> statements=new ArrayList<Statement>();
    public TernaryExpression(TernaryExpression ternaryExpression) {
        this.ternaryExpression = ternaryExpression;
    }

    public void addStatement(Statement statement){
        this.statements.add(statement);
    }

    public void setConditions(Conditions conditions) {
        this.conditions = conditions;
    }

    @Override
    public String toString() {
        String str="TernaryExpression {\n\t" +
                "conditions: " + conditions;
        if(ternaryExpression!=null){
            str+=   ",\n\tternaryExpression : " + ternaryExpression;
        }
        str+=",\n\tstatements :" + statements +
                '}';
        return str;
    }
}
