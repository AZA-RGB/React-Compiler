package AST;

import java.util.ArrayList;
import java.util.List;

public class ArrowFunction implements  ASTNode{
    List<Argument> arguments=new ArrayList<>();

    FunctionBody functionBody;
    public void  addArgument(Argument argument){
        arguments.add(argument);
    }

    public ArrowFunction(FunctionBody functionBody) {
        this.functionBody = functionBody;
    }

    @Override
    public String toString() {
        return "ArrowFunction{" +
                "arguments:" + arguments +
                ",\n\t" + functionBody +"\n"+
                '}';
    }
}
