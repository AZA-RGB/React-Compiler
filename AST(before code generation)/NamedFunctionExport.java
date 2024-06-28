package AST;

public class NamedFunctionExport implements ASTNode{
    NamedFunction namedFunction;

    public NamedFunctionExport(NamedFunction namedFunction) {
        this.namedFunction = namedFunction;
    }

    @Override
    public String toString() {
        return "NamedFunctionExport{\n" + namedFunction +"}\n";
    }
}
