package AST;

public class FunctionalComponent implements ASTNode {
    ASTNode initialValue;

    public FunctionalComponent(ASTNode initialValue) {

        this.initialValue = initialValue;
    }

    @Override
    public String toString() {
        return "FunctionalComponent{\n\t" + initialValue + "\n\t}";
    }
}
