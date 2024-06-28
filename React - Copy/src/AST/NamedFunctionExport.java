package AST;

public class NamedFunctionExport extends ASTNode {
    NamedFunction namedFunction;

    public NamedFunctionExport(NamedFunction namedFunction) {
        this.namedFunction = namedFunction;
    }

    @Override
    public String toString() {
        return "NamedFunctionExport{\n" + namedFunction +"}\n";
    }

	public String toJS() {
		return "export "+namedFunction.toJS();
	}
}