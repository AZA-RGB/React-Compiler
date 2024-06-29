package AST;

public class JsxSpreadAttribute extends ASTNode {
    SpreadOperation spredoperation;

    public JsxSpreadAttribute(SpreadOperation spredoperation) {
        this.spredoperation = spredoperation;
    }

    @Override
    public String toString() {
        return "JsxSpreadAttribute {\n" +
                 spredoperation +
                "\n},\n";
    }

    @Override
    public String toJS() {
        StringBuilder jsxSpreadCode=new StringBuilder();
        jsxSpreadCode.append("["+spredoperation.toJS()+"]");
        return jsxSpreadCode.toString();
    }

    public String toJS(Boolean isForCustomComponent) {
        StringBuilder jsxSpreadCode=new StringBuilder();
            jsxSpreadCode.append(spredoperation.toJS());
        return jsxSpreadCode.toString();
	}
}