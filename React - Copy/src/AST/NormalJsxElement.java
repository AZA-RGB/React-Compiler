package AST;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.isUpperCase;

public class NormalJsxElement extends ASTNode  {
    List<Object> children=new ArrayList<>();
    OpenTag openTag;
    CloseTag closeTag;


    public NormalJsxElement(OpenTag openTag, CloseTag closeTag) {
        this.openTag = openTag;
        this.closeTag = closeTag;
    }

    public void addChild(Object child){
        this.children.add(child);
    }
    @Override
    public String toString() {
        String result="NormalJsxElement{" +openTag +",\n "+
                "children:[\n";
        for (Object child:children) {
             if(child instanceof String){
                 result+="jsxText:"+ child ;
             }   else{
                 result+=child.toString();
             }
        }
              result  +="],\n "+closeTag +'}';
        return  result;
    }



	public String toJS() {
        StringBuilder normalJsxElementCode=new StringBuilder();
        String tagName=openTag.getId();
        if(!isUpperCase(tagName.charAt(0))){/// <h1></h1>

            normalJsxElementCode.append("( ()=>{");// initializing the IIFE

            normalJsxElementCode.append("const ").append(tagName).append(" = document.createElement('").append(tagName).append("');\n\t ");

            //children loop
            if (!children.isEmpty()) {
                for (Object child : children) {
                    if ((child instanceof String)) {
                        normalJsxElementCode.append(tagName).append(".insertAdjacentHTML('beforeend','").append(child).append("');");
                    } else if(child instanceof JsxExpression){
                        normalJsxElementCode.append(tagName).append(".insertAdjacentHTML('beforeend', (()=>{\n" +
                                "  \t\t\t\t\t\t\tconst childText= ("+ ((JsxExpression) child).toJS()+");\n" +
                                "  \t\t\t\t\t\t\tif(childText instanceof HTMLElement){\n" +
                                "  \t\t\t\t\t\t\t    return childText.outerHTML\n" +
                                "  \t\t\t\t\t\t\t}else{\n" +
                                "  \t\t\t\t\t\t\treturn childText\n" +
                                "  \t\t\t\t\t\t\t}\n" +
                                "  \t\t\t\t\t\t\t\t})());");
                    }else if(child instanceof jsx) {
                        normalJsxElementCode.append(tagName).append(".appendChild(" + ((jsx) child).toJS() + ");");
                    }
                    normalJsxElementCode.append(' ');
                }
            }

            // attributes loop




            normalJsxElementCode.append("return ").append(tagName);
            normalJsxElementCode.append("})()");

            return normalJsxElementCode.toString();
        }
        else{ // custom component <Card />
            StringBuilder customComponentProps=new StringBuilder();
                if (!children.isEmpty() || !openTag.jsxAttributes.isEmpty()){
                    customComponentProps.append("Object.assign(");
                        if(!openTag.jsxAttributes.isEmpty()){
                            customComponentProps.append(addAttributesToCustomComponent());
                        }
                        if(!children.isEmpty()){
                            customComponentProps.append(addChildrenToCustomComponent());
                        }
                    customComponentProps.append(')');
                }
                if (jsxExpDepth > 0) normalJsxElementCode.append('`');
                normalJsxElementCode.append("${").append(openTag.getId()).append("(").append(customComponentProps).append(")}");
                if (jsxExpDepth > 0)  normalJsxElementCode.append('`');
            }

            return normalJsxElementCode.toString();
        }


    private String addAttributesToCustomComponent(){
        StringBuilder jsxAttributesCode=new StringBuilder();
        List<ASTNode> jsxAttributes =openTag.getJsxAttributes();
            for (int i = 0; i < jsxAttributes.size() ; i++) {
                if(i==jsxAttributes.size()-1 && children.isEmpty()){
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

    private String addChildrenToCustomComponent(){
        StringBuilder childrenCode=new StringBuilder("{children:");
        System.out.println(
                children.toString()
        );
            for (Object child : children) {
                if(children.indexOf(child)!=0 && children.size()>1) {// if it is the first but not last
                    childrenCode.append('+');
                }
                if (child instanceof String) { /* `fascia` */
                    childrenCode.append('`').append(child).append('`');
                } else {
                    String childToJs = ((ASTNode) child).toJS();
                    if (childToJs.charAt(0) == '`') {
                            childrenCode.append(childToJs);
                        } else {
                            childrenCode.append('`').append(childToJs).append('`');
                        }
                    }
                }
            childrenCode.append('}');
            return  childrenCode.toString();
    }

}