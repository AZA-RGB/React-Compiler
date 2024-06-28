package AST;

public class MemberExpression implements ASTNode {

    ASTNode object,property;

    public MemberExpression(ASTNode object, ASTNode property) {
        this.object = object;
        this.property = property;
    }
    public MemberExpression(ASTNode object) {
        this.object = object;
        this.property = null;
    }

    @Override
    public String toString() {
       String result="MemberExpression{\n";
       result+= "object:" + object;
       if(this.property!=null){
           result+= "\n,property:" + property+ "\n}\n";
       }
        return result;
    }
}
