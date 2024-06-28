package AST;

public class Operator extends ASTNode {
String operator="";

    public Operator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "operator:"+this.operator+",\n";
    }

	public String toJS() {
		return operator;
	}
}