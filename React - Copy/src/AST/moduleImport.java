package AST;

public class moduleImport extends ASTNode{
    String moduleName="";

    public moduleImport(String moduleName) {
        this.moduleName = moduleName;
    }

    @Override
    public String toString() {
        return"moduleimport:{"+moduleName+"}";
    }

    @Override
    public String toJS() {
        return "import "+moduleName;
    }
}
