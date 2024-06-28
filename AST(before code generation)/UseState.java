package AST;

public class UseState implements  ASTNode{
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
}
