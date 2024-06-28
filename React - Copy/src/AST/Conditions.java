package AST;

import java.util.ArrayList;
import java.util.List;

public class Conditions extends ASTNode {
    List<Condition> conditions=new ArrayList<>();
    List<String> and_ors=new ArrayList<>();

    public void addCondition(Condition condition){
        this.conditions.add(condition);
    }

    public void addAnd_Or(String and_or){
        this.and_ors.add(and_or);
    }

    @Override
    public String toString() {
        return "Conditions{\n\t" +
                "conditions : " + conditions +
                "\n}";
    }

    public String toJS() {
        StringBuilder statementCode = new StringBuilder();
        if (conditions != null && !conditions.isEmpty()) {

            for (int i = 0; i < conditions.size(); i++) {
                if(i==conditions.size()-1){
                    statementCode.append(conditions.get(i).toJS());
                }else {
                    statementCode.append(conditions.get(i).toJS()+and_ors.get(i)+" ");
                }
            }
        }
        return statementCode.toString();
    }
}