package AST;

public class OperatorElement extends  ASTNode{
  ASTNode value;

    public OperatorElement( ASTNode value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "OperatorElement{\n\t" +
            "value=" + value +
                '}';
    }

	public String toJS() {
		return value.toJS();
	}
}