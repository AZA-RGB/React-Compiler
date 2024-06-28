package AST;

public class Literal extends ASTNode {
public final String type,value;

    public Literal(String type, String value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString() {
        //System.out.println("from literal class --- type ---" +type+"--- value---"+value);

        return "Literal:{\n\t"+"type:"+this.type+",\n " +
                "\tvalue:"+this.value+",\n\t\t},";
    }

	public String toJS() {
		return value;
	}
}