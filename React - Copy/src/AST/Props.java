package AST;

public class Props extends ASTNode{
    private  ASTNode value=null; //null/objectliteral/id

    public Props(ASTNode value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "props:{\n\t" + (this.value != null ? this.value.toString() : "null") + "\n\t},";
    }



	public String toJS() {
        if(this.value != null){
            return value.toJS(); // object or literal
        }
		return "null";
	}
}


























