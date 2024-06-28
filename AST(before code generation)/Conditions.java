package AST;

import java.util.ArrayList;
import java.util.List;

public class Conditions implements ASTNode{
    List<Condition> conditions=new ArrayList<>();

    public void addCondition(Condition condition){
        this.conditions.add(condition);
    }


    @Override
    public String toString() {
        return "Conditions{\n\t" +
                "conditions : " + conditions +
                "\n}";
    }
}
