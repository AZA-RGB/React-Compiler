package AST;

import java.util.ArrayList;
import java.util.List;

public class AnonymousFunction implements  ASTNode{
    List<Argument> arguments=new ArrayList<>();

    FunctionBody functionBody;
    public void  addArgument(Argument argument){
        arguments.add(argument);
    }

    public AnonymousFunction(FunctionBody functionBody) {
        this.functionBody = functionBody;
    }

    @Override
    public String toString() {
        return "AnonymousFunction{" +
                "arguments:" + arguments +
                ",\n\t" + functionBody +"\n"+
                '}';
    }
}
