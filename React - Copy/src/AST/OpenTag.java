package AST;

import java.util.ArrayList;
import java.util.List;

public class OpenTag extends ASTNode {
    String id;

    public String getId() {
        return id;
    }

    List<ASTNode> jsxAttributes=new ArrayList<>();

    public List<ASTNode> getJsxAttributes() {
        return jsxAttributes;
    }

    public OpenTag(String id) {
        this.id = id;
    }
    public void addJsxAttribute(ASTNode attribute){
        this.jsxAttributes.add(attribute);
    }

    @Override
    public String toString() {
        return "\n\tOpenTag{\n" +
                "\t\ttag_name:" + id +
                ",\n\t\tjsxAttributes" + jsxAttributes +"\n"+
        "}\n";
    }

	public String toJS() {
        StringBuilder openTagCode=new StringBuilder();
        openTagCode.append('<'+id);
        if (!jsxAttributes.isEmpty()){
            for (int i = 0; i <jsxAttributes.size() ; i++) {
                openTagCode.append(jsxAttributes.get(i).toJS()).append(' ');
            }
        }
        openTagCode.append('>');
		return openTagCode.toString();
	}
}