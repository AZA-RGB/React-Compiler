package AST;

public class Property implements ASTNode{
    public  Identifier key;
    public  ObjectExpression value;

    public Property(Identifier key, ObjectExpression value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {

        String result="property:{\n\t"+"key:"+this.key+"\n\tvalue:";
        if(this.value!=null){
            result+=this.value.toString()+"\n},\n";
        }else{
            result+="null\n},\n";
        }
        return result;
    }
}
