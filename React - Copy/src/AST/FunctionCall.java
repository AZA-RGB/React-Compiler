package AST;

import java.util.ArrayList;
import java.util.List;

public class FunctionCall extends ASTNode {

    public String functionName;
    Boolean isAwait;
    List<Argument> args=new ArrayList<>();
    public FunctionCall(String functionName,Boolean isAwait) {
        this.functionName = functionName;
        this.isAwait=isAwait;
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

	public String toJS() {
        StringBuilder functionCall=new StringBuilder();
        if (isAwait) functionCall.append("await ");
        functionCall.append(functionName);
        if(args!=null && !args.isEmpty()){
            StringBuilder  argumentsCode=new StringBuilder();
            for (int i = 0; i < args.size(); i++) {
                if(i== args.size()-1){
                    argumentsCode.append(args.get(i).toJS());
                }else {
                    argumentsCode.append(args.get(i).toJS()).append(",");
                }
            }
            functionCall.append("(").append(argumentsCode).append(")");
        }else{
            functionCall.append("()");
        }

        return functionCall.toString();
    }

}