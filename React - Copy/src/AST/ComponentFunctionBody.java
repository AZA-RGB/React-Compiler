package AST;

import java.util.ArrayList;
import java.util.List;

public class ComponentFunctionBody extends ASTNode  {
    ComponentReturnStatement componentReturnStatement;
    List<Statement> statements = new ArrayList<Statement>();

    public ComponentFunctionBody() {

    }

    public void setComponentReturnStatement(ComponentReturnStatement componentReturnStatement) {
        this.componentReturnStatement = componentReturnStatement;
    }

    public void addStatement(Statement statement) {
        this.statements.add(statement);
    }

    @Override
    public String toString() {

        return "ComponentFunctionBody{\n\tstatements :" + statements + "\n\t," + componentReturnStatement +
                "\n}\n";


    }

	public String toJS() {
		StringBuilder componentFunctionBodyCode=new StringBuilder();
        if(!statements.isEmpty()) {
            for (Statement stmt :statements) componentFunctionBodyCode.append(stmt.toJS()+";\n");
        }
        componentFunctionBodyCode.append(componentReturnStatement.toJS());
        return componentFunctionBodyCode.toString();
	}
}