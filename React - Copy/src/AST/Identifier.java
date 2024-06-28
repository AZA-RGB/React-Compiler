package AST;

public class Identifier extends ASTNode {
   public final String id;

    public Identifier(String id) {
        this.id = id;
    }

    @Override
    public String toString() {

        return "identifier:"+this.id+",";
    }

	public String toJS() {
		return id;
	}
}