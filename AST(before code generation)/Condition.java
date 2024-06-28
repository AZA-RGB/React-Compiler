package AST;

public class Condition implements  ASTNode{
 OperatorElement conditionValue1;
 String operation=null;
 OperatorElement conditionValue2=null;

    public Condition(OperatorElement conditionValue1, String operation, OperatorElement conditionValue2) {
        this.conditionValue1 = conditionValue1;
        this.operation = operation;
        this.conditionValue2 = conditionValue2;
    }

    @Override
    public String toString() {

        String str="Condition{\n\t" +
                "conditionValue1 : " + conditionValue1;
        if (operation!=null){
            str+=",\n\toperation : " + operation +
                    ",\n\tconditionValue2 : " + conditionValue2 +
                    "}\n";
        }
        return str;

    }
}
