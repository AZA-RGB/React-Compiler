package AST;

public class UseState extends  ASTNode{
    Identifier state,setStateFunction;
    ASTNode initialValue;


    public UseState(Identifier state, Identifier setStateFunction, ASTNode initialValue) {
        this.state = state;
        this.setStateFunction = setStateFunction;
        this.initialValue = initialValue;
    }

    @Override
    public String toString() {
        return "UseState{ " +
                "state : " + state +
                "\n\t, setStateFunction : " + setStateFunction +
                "\n\t, initialValue : " + initialValue +
                '}';
    }

	public String toJS() {
        //initialValue here could be literal or Identifier
		return "  if (typeof "+state.toJS()+" === \"undefined\") {\n" +
                "     window."+state.toJS()+" = "+initialValue.toJS()+";\n" +
                "  }\n" +
                "\n" +
                "  window."+setStateFunction.toJS()+" = (newVal) => {\n" +
                "    "+state.toJS()+" = newVal;\n" +
                "    re_render();\n" +
                "  }";
	}
}