package AST;

public class CloseTag extends  ASTNode{
    String id;

    public String getId() {
        return id;
    }

    public CloseTag(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CloseTag{\n" +
                "\t\ttag_name:" + id +
                "\n}\n";
    }

	public String toJS() {
		return "</"+id+'>';
	}
}