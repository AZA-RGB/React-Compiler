package AST;
 public abstract class ASTNode {
	 public static int jsxExpDepth=0;
	 String  contextText= "";
	 public void setContextText(String contextText) {
		 this.contextText = contextText;
	 }

	 public String toJS() {
		return contextText;
	}
}