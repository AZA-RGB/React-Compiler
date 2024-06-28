package AST;

import java.util.Objects;

public class MemberExpression extends ASTNode  {

    ASTNode object,property;
    String type;
    public MemberExpression(ASTNode object, ASTNode property,String type) {
        this.object = object;
        this.property = property;
        this.type=type;
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

	public String toJS() {
    StringBuilder memberExpression =new StringBuilder();

    memberExpression.append(object.toJS());
    if (property!=null) {
        if (Objects.equals(type, "DOT")) {
            memberExpression.append(".").append(property.toJS());
        } else  if (Objects.equals(type, "LSBRACKET")) {
            memberExpression.append('[').append(property.toJS()).append(']');
     }
    }
    return memberExpression.toString();

    }
}