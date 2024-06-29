package AST;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.isUpperCase;

public class SelfClosingTag extends ASTNode {
        String id;
    List<ASTNode> jsxAttributes=new ArrayList<>();

    public SelfClosingTag(String id) {
        this.id = id;
    }
    public void addJsxAttribute(ASTNode attribute){
        this.jsxAttributes.add(attribute);
    }

    @Override
    public String toString() {
        return "SelfClosingTag{" +
                "id:" + id +
                "\n, jsxAttributes" + jsxAttributes +",\n"+
                "},\n";
    }


    public String toJS() {
        StringBuilder normalJsxElementCode=new StringBuilder();
        String tagName=id;
        List<ASTNode> attributes = jsxAttributes;
        if(!isUpperCase(tagName.charAt(0))){/// <input />
            normalJsxElementCode.append("( ()=>{");// initializing the IIFE
            normalJsxElementCode.append("const ").append(tagName).append(" = document.createElement('").append(tagName).append("');\n\t ");
            // attributes loop
            if (!attributes.isEmpty()){
                for (ASTNode attribute:attributes){
                    if (attribute instanceof EventAttribute){
                        normalJsxElementCode.append(tagName).append(".addEventListener(").append(attribute.toJS()).append(");");
                    } else if (attribute instanceof JsxIdentifier) {
                        normalJsxElementCode.append(tagName).append(".setAttribute(").append(attribute.toJS()).append(");");
                    }else if(attribute instanceof JsxIdentifier){
                        normalJsxElementCode.append(tagName).append(".setAttribute(").append(attribute.toJS()).append(");");
                    }
                }
            }
            normalJsxElementCode.append("return ").append(tagName);
            normalJsxElementCode.append("})()");

            return normalJsxElementCode.toString();
        }else {
            StringBuilder customComponentProps=new StringBuilder();
            if (!this.jsxAttributes.isEmpty()){
                customComponentProps.append("Object.assign(");
                    customComponentProps.append(addAttributesToCustomComponent());
                customComponentProps.append(')');
            }

            normalJsxElementCode.append(id).append("(").append(customComponentProps).append(");");






        }
        
        return normalJsxElementCode.toString();
    }


    private String addAttributesToCustomComponent(){
        StringBuilder jsxAttributesCode=new StringBuilder();
        List<ASTNode> jsxAttributes =this.jsxAttributes;
        for (int i = 0; i < jsxAttributes.size() ; i++) {
            if(i==jsxAttributes.size()-1){
                if(jsxAttributes.get(i) instanceof JsxIdentifier )
                    jsxAttributesCode.append(((JsxIdentifier)jsxAttributes.get(i)).toJS(true));
                else if(jsxAttributes.get(i) instanceof JsxSpreadAttribute)
                    jsxAttributesCode.append(((JsxSpreadAttribute)jsxAttributes.get(i)).toJS(true));
                else
                    jsxAttributesCode.append(((EventAttribute)jsxAttributes.get(i)).toJS(true));
            }else {
                if (jsxAttributes.get(i) instanceof JsxIdentifier)
                    jsxAttributesCode.append(((JsxIdentifier) jsxAttributes.get(i)).toJS(true)).append(',');
                else if(jsxAttributes.get(i) instanceof JsxSpreadAttribute)
                    jsxAttributesCode.append(((JsxSpreadAttribute) jsxAttributes.get(i)).toJS(true)).append(',');
                else
                    jsxAttributesCode.append(((EventAttribute)jsxAttributes.get(i)).toJS(true)).append(',');
            }

        }
        return jsxAttributesCode.toString();
    }

   
}