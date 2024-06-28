package AST;

import java.util.ArrayList;
import java.util.List;

public class NamedFunction implements  ASTNode{
    Identifier functionName;
    List<Argument> arguments=new ArrayList<>();

    FunctionBody functionBody;

    public NamedFunction(Identifier functionName, FunctionBody functionBody) {
        this.functionName = functionName;
        this.functionBody = functionBody;
    }
    public void  addArgument(Argument argument){
        arguments.add(argument);
    }

    @Override
    public String toString() {
        return "NamedFunction{" +
                "functionName: " + functionName +
                "\n \t arguments: " + arguments +
                ",\n \t" + functionBody +
                '}';
    }
}
