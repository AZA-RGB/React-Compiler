package AST;

public class VariableDeclarator extends ASTNode {
    Identifier id;
    ASTNode initialValue;

    public VariableDeclarator(Identifier id, ASTNode initialValue) {
        this.id = id;
        this.initialValue = initialValue;
    }
    public VariableDeclarator(Identifier id ) {
        this.id = id;
        this.initialValue =new Literal("Undefined","undefined");
    }

    @Override
    public String toString() {
        return "\t"+this.id+"\n\tinitialValue:"+initialValue;
    }

	public String toJS() {
        //System.out.println("from vairaibleDeclarator -------------------"+ initialValue);

        StringBuilder variableDeclaratorCode=new StringBuilder();

        if (initialValue!=null){
            variableDeclaratorCode.append(id.toJS()).append(" = ").append(initialValue.toJS());
        }else {
            variableDeclaratorCode.append(id.toJS());
        }
        return  variableDeclaratorCode.toString();
	}
}