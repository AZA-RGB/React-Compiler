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
        StringBuilder selfClosingTagCode=new StringBuilder();

        if (!isUpperCase(id.charAt(0))){
            selfClosingTagCode.append("<");
            selfClosingTagCode.append(id);

            if (!jsxAttributes.isEmpty()){
                for (ASTNode jsxAttribute : jsxAttributes) {
                    selfClosingTagCode.append(jsxAttribute.toJS()).append(' ');
                }
            }
            selfClosingTagCode.append(" />");

            return selfClosingTagCode.toString();
        }

        else{ ///////////////////////////////////////////////////////  custom component <Card />
            // if inside dollar ---> add
        StringBuilder jsxAttributesCode=new StringBuilder();
        if(!jsxAttributes.isEmpty()){
            jsxAttributesCode.append("Object.assign(");
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
                    else
                        jsxAttributesCode.append(((JsxSpreadAttribute) jsxAttributes.get(i)).toJS(true)).append(',');
                }

            }
            jsxAttributesCode.append(')');

        }
        if(jsxExpDepth>0) selfClosingTagCode.append('`');
        selfClosingTagCode.append("${").append(id).append("(").append(jsxAttributesCode).append(")}");
        if(jsxExpDepth>0) selfClosingTagCode.append('`');


		return selfClosingTagCode.toString();
	    }
    }
}