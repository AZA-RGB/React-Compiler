package AST;

public class OperatorElement implements  ASTNode{
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
}
