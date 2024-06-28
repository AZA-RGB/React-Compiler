package AST;

import org.antlr.v4.runtime.atn.SemanticContext;

import java.util.ArrayList;
import java.util.List;

public class ObjectLiteral extends  ASTNode{
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

	public String toJS() {

        StringBuilder objectLiteralCode= new StringBuilder();
        objectLiteralCode.append('{');
        if(!properties.isEmpty()){
            for (int i = 0; i < properties.size() ; i++) {
                if(i== properties.size()-1){
                    objectLiteralCode.append(properties.get(i).toJS());
                }else{
                    objectLiteralCode.append(properties.get(i).toJS()+',');
                }
            }
        }
        objectLiteralCode.append('}');



        return objectLiteralCode.toString();
	}
}