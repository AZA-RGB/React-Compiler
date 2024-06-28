package AST;

public class ComponentReturnStatement extends ASTNode  {
    ASTNode value;

    public ComponentReturnStatement(ASTNode value) {
        this.value = value;
    }

    @Override
    public String toString() {

        if (value != null)
            return "ComponentReturnStatement:argument:\n" + this.value;
        return "ComponentReturnStatement:argument:\n Null";

    }

	public String toJS() {
        if (value instanceof  jsx)
            return "return ("+value.toJS()+")";
        return "return ( "+value.toJS()+" )";
	}
}