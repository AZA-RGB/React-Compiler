package AST;

import java.util.ArrayList;
import java.util.List;

public class FunctionCall implements ASTNode{

    public String functionName;
    List<Argument> args=new ArrayList<>();
    public FunctionCall(String functionName) {
        this.functionName = functionName;
    }

    public void addArgument(Argument argument){
        this.args.add(argument);
    }
    @Override
    public String toString() {
        String result="functionCall:{\n\tfunctionName:"+this.functionName+",\n";
        result+="\targumnets:[";
        for (Argument arg:this.args) {
            result+="\t"+arg+"\n";
        }
        result+="],\n";
        result+="},\n";

        return result;
    }
}
