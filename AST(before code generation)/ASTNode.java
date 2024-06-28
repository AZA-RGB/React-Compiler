package AST;
public abstract class ASTNode {
    String  contextText= "";

    public void setContextText(String contextText) {
        this.contextText = contextText;
    }

    public String ToJS() {
        return contextText;
    }
}