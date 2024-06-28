package AST;

public class ReturnStatement extends ASTNode {
    ASTNode value;

    public ReturnStatement(ASTNode value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "returnStatement:argument:\n"+this.value;
    }

	public String toJS() {
		return "return ( "+
              ( (value instanceof jsx)? ('`'+value.toJS()+'`') : (value.toJS()) )
                +" );\n";
	}
}