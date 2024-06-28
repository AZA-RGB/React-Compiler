package AST;

public class Identifier implements ASTNode{
   public final String id;

    public Identifier(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "identifier:"+this.id+",";
    }
}
