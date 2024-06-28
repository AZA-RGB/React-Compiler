package AST;

public class FunctionalComponent extends ASTNode  {
    ASTNode initialValue;

    public FunctionalComponent(ASTNode initialValue) {

        this.initialValue = initialValue;
    }

    @Override
    public String toString() {
        return "FunctionalComponent{\n\t" + initialValue + "\n\t}";
    }

	public String toJS() {
		return initialValue.toJS();
	}
}