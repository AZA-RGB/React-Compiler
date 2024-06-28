package AST;

public class Statement extends ASTNode {
    ASTNode value;

    public Statement(ASTNode value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "\n\tstatement:"+this.value;
    }

	public String toJS() {

        if(value!=null){
            return value.toJS();
        }
//        System.out.println("null");
        return "null";
    }
}