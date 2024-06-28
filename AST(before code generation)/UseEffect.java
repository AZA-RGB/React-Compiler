package AST;

public class UseEffect implements  ASTNode{
    DependencyArray dependencyArray;

    ArrowFunction callBackFunction;

    public UseEffect(DependencyArray dependencyArray, ArrowFunction callBackFunction) {
        this.dependencyArray = dependencyArray;
        this.callBackFunction = callBackFunction;
    }

    @Override
    public String toString() {
        return "UseEffect{\n\t" +
                 dependencyArray +
                ",\n\t callBackFunction: " + callBackFunction +
                '}';
    }
}
