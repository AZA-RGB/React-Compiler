package AST;

public class UserRefDeclaration extends ASTNode {
    Identifier id;
    ASTNode initilaValue;

    public UserRefDeclaration(Identifier id, ASTNode initilaValue) {
        this.id = id;
        this.initilaValue = initilaValue;
    }

    @Override
    public String toString() {
        return "userRefDeclaration:{\n\t"+this.id+"\n\t initialValue:"+this.initilaValue+"},\n";
    }

	public String toJS() {
        return "const " + id.toJS() + " = { current:" + initilaValue.toJS() + "}";
	}
}









