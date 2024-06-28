package AST;

import java.util.ArrayList;
import java.util.List;

public class ObjectLiteral implements  ASTNode{
    List<Property> properties=new ArrayList<>();

    public void addProperty(Property property){
        properties.add(property);
    }

    @Override
    public String toString() {
        String result="ObjectLiteral:{\n";

        for (Property property:this.properties) result += "\t" + property.toString();
        result+="}\n";

        return result;
    }
}
