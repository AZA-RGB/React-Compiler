package AST;

public class VariableDeclarator implements ASTNode{
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
}
