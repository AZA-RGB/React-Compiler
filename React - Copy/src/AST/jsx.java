package AST;

public class jsx extends ASTNode  {
    ASTNode value;

    public ASTNode getValue() {
        return value;
    }

    public jsx(ASTNode value) {
        this.value = value;
    }
    @Override
    public String toString(){
        return
               "jsx_Element:{"+'\n' +'\t'+ this.value+"\n},";
    }

	public String toJS() {
		return value.toJS();
	}
}