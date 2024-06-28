package AST;

public class Literal implements ASTNode{
public final String type,value;

    public Literal(String type, String value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Literal:{\n\t"+"type:"+this.type+",\n " +
                "\tvalue:"+this.value+",\n\t\t},";
    }
}
