package AST;

import java.util.ArrayList;
import java.util.List;

public class DependencyArray extends  ASTNode{
    List<Identifier> identifierList=new ArrayList<>();
    public void addToIdentifierList(Identifier e){
        identifierList.add(e);
    }

    @Override
    public String toString() {
        return "DependencyArray{\n\t" +
                identifierList +
                '}';
    }

	public String ToJS(String dependencyArrayName) {


        StringBuilder dependencyArrayCode=new StringBuilder();
       // String dependencyArrayName= dependencyArrayCode.append("Dep").append(randomNum).append(componentName).toString();
        dependencyArrayCode.append(dependencyArrayName).append(" = {};\n"); //Dep = {};
        if(!identifierList.isEmpty()) {//Dep["prevcount"] = count;
            for (int i = 0; i < identifierList.size(); i++) {

                dependencyArrayCode.append(dependencyArrayName).append("[\"prev")
                        .append(identifierList.get(i).toJS()).append("\"] = ").
                        append(identifierList.get(i).toJS()).append(";\n");

            }
        }
		return dependencyArrayCode.toString();
	}
}