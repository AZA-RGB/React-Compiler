package AST;

import java.util.Objects;

public class JsxIdentifier extends ASTNode {
    ASTNode value;
    String  name;

    public JsxIdentifier(String name) {
        this.name = name;
        this.value=null;
    }

    public JsxIdentifier(ASTNode value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String toString() {
       String result= "\n\t\tJsxIdentifier{";
        result+="\n\t\t\tname:'" + name +","+ '\n';
       if(value!=null){
           result+= "value:" + value;
         }
        return result +
                "\t\t}\n";
    }

    @Override
    public String toJS() {
        StringBuilder JsxIdentifierCode=new StringBuilder();
        String val = "";
        if (value!=null&& !Objects.equals(value.toJS(), "false")&&!(Objects.equals(value.toJS(), "true"))){//id=value

            val=value.toJS();

        }
        else if ((value==null)||(Objects.equals(value.toJS(), "true"))){ //eg:checked=true -> checked
                val="true";
        }

        return "'"+name+"' , "+val;
    }

    public String toJS(boolean isCostumeComponent) {
            StringBuilder JsxIdentifierCode=new StringBuilder("{");
            JsxIdentifierCode.append(name).append(':');
            if (value!=null){//id=value
                if (value instanceof  JsxExpression) {//id={}
                    JsxIdentifierCode.append(((JsxExpression) value).toJS(true));
                }else {
                    JsxIdentifierCode.append(value.toJS());
                }

            }else {// boolean Attribute eg:checked
                JsxIdentifierCode.append("true");
            }
            JsxIdentifierCode.append('}');
            return JsxIdentifierCode.toString();
	}
}