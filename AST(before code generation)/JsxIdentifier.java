package AST;

public class JsxIdentifier implements ASTNode{
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
}
