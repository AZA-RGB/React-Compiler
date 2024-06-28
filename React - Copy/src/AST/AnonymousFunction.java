package AST;

import java.util.ArrayList;
import java.util.List;

public class AnonymousFunction extends  ASTNode{
    List<Argument> arguments=new ArrayList<>();

    FunctionBody functionBody;
    public void  addArgument(Argument argument){
        arguments.add(argument);
    }

    public AnonymousFunction() {

    }

    public void setFunctionBody(FunctionBody functionBody) {
        this.functionBody = functionBody;
    }
    @Override
    public String toString() {
        return "AnonymousFunction{" +
                "arguments:" + arguments +
                ",\n\t" + functionBody +"\n"+
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
            return "function("+ argumentsCode +"){\n"+functionBody.toJS()+"}";
        }
        return "function (){\n"+functionBody.toJS()+"}";
	}
}