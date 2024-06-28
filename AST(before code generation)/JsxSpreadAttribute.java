package AST;

public class JsxSpreadAttribute implements ASTNode{
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
}
