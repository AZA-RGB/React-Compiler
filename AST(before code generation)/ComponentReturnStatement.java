package AST;

public class ComponentReturnStatement implements ASTNode {
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
}

