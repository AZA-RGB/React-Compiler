package AST;

import java.util.ArrayList;
import java.util.List;

public class ArrowFunction extends  ASTNode{
    List<Argument> arguments=new ArrayList<>();

    FunctionBody functionBody;
    Boolean isLambdaExpression;
    public void  addArgument(Argument argument){
        arguments.add(argument);
    }

    public ArrowFunction(Boolean  isLambdaExpression) {
        this.isLambdaExpression=isLambdaExpression;
    }

    public FunctionBody getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(FunctionBody functionBody) {
        this.functionBody = functionBody;
    }
    @Override
    public String toString() {
        return "ArrowFunction{" +
                "arguments:" + arguments +
                ",\n\t" + functionBody +"\n"+
                '}';
    }


	public String toJS() {
        StringBuilder ArrowFunctionCode=new StringBuilder();
        if(arguments!=null && !arguments.isEmpty()){
            StringBuilder  argumentsCode=new StringBuilder();
            for (int i = 0; i < arguments.size(); i++) {
                if(i== arguments.size()-1){
                    argumentsCode.append(arguments.get(i).toJS());
                }else {
                    argumentsCode.append(arguments.get(i).toJS()).append(",");
                }
            }
            ArrowFunctionCode.append("( ").append(argumentsCode).append(" )=>"+(isLambdaExpression?"( ":"{\n"))
                    .append(functionBody.toJS()).append((isLambdaExpression?" )":"}"));
        }else {
            ArrowFunctionCode.append("()=>" + (isLambdaExpression ? "(" : "{\n"))
                    .append(functionBody.toJS()).append((isLambdaExpression ? " )" : "}"));
        }
          return ArrowFunctionCode.toString()+"\n";
	}



}