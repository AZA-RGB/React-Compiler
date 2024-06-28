package AST;

public class UserRefDeclaration implements ASTNode{
    Identifier id;
    ASTNode initilaValue;

    public UserRefDeclaration(Identifier id, ASTNode initilaValue) {
        this.id = id;
        this.initilaValue = initilaValue;
    }

    @Override
    public String toString() {
        return "userRefDeclaration:{\n\t"+this.id+"\n\t initialValue:"+this.initilaValue+"},\n";
    }
}
