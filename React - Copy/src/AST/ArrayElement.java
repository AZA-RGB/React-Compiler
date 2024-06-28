package AST;

public class ArrayElement extends ASTNode  {
    public ASTNode value;

    public ArrayElement(ASTNode value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ArrayElement:{\n\t" + this.value.toString() + "\n},\n";
    }

	public String toJS() {
		return value.toJS();
	}
}