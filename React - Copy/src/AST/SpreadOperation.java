package AST;

public class SpreadOperation extends ASTNode {
    ASTNode argument;

    public SpreadOperation(ASTNode argument) {
        this.argument = argument;
    }

    @Override
    public String toString() {
        return "SpreadOperation{\n" +
                "argument:" + argument +
                "\n}\n";
    }

	public String toJS() {
        // Do not add curly braces for the sake of Object.assign
		return "..."+argument.toJS();
	}
}