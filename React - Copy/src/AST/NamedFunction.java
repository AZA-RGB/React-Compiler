package AST;

import java.util.ArrayList;
import java.util.List;

public class NamedFunction extends  ASTNode{
    Identifier functionName;
    List<Argument> arguments=new ArrayList<>();

    FunctionBody functionBody;
    Boolean isAsync;

    public NamedFunction(Identifier functionName,Boolean isAsync) {
        this.isAsync=isAsync;
        this.functionName = functionName;
    }

    public void setFunctionBody(FunctionBody functionBody) {
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

	public String toJS() {
        if(arguments!=null && !arguments.isEmpty()){
            StringBuilder  argumentsCode=new StringBuilder();
            for (int i = 0; i < arguments.size(); i++) {
                if(i== arguments.size()-1){
                    argumentsCode.append(arguments.get(i).toJS());
                }else {
                    argumentsCode.append(arguments.get(i).toJS()).append(",");
                }
            }
            return (isAsync?"async":"")+" function "+functionName.toJS() +" ("+ argumentsCode +"){\n"+functionBody.toJS()+"}";
        }
        return (isAsync?"async":"")+" function "+functionName.toJS() +" (){\n"+functionBody.toJS()+"}";
	}
}