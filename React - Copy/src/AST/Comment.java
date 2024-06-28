package AST;

public class Comment extends ASTNode  {
    String type, content;

    public Comment(String type, String content) {
        this.type = type;
        this.content = content;
    }

    @Override
    public String toString() {
        return "comment:{\n\t" + "type:" + this.type + ",\n\t content:\t" + this.content + "\n},\n";
    }

	public String toJS() {
		if (type=="Block_comment")
            return content+'\n';
        return content;
	}
}