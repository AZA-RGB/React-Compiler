package AST;
public class EventAttribute extends ASTNode{

    MemberExpression function ;
    String type,event;
        public EventAttribute(MemberExpression function, String type, String event){
            this.function=function;
            this.type=type;
            this.event=event;
        }


    public String toJS(Boolean isCustomComponent) {
        //System.out.println(this.type);
        StringBuilder eventAttributeCode =new StringBuilder("{");
        if(type.equals("expression")){//"expression" onclick:{expression}
            eventAttributeCode.append(event).append(":{ ").append(function.toJS()).append(" }");
        } else if (type.equals("arrow")) {// "arrow" onclick:()=>{}
            eventAttributeCode.append(event).append(":()=>{ ").append(function.toJS()).append(" }");
        }else{// "lambda" onclick:()=> expression
            eventAttributeCode.append(event).append(":()=>").append(function.toJS()).append(" }");
        }
        eventAttributeCode.append("}");
        return eventAttributeCode.toString();
    }



    @Override
    public String toJS() {
        //onclick="memberExpression.toJs()"
        StringBuilder eventAttributeCode=new StringBuilder(" "+event.toLowerCase()+"=\"");
        String fnCode=function.toJS();
        eventAttributeCode.append(fnCode);
        if(!(fnCode.charAt(fnCode.length()-1)==')')){
            eventAttributeCode.append("()");
        }
        eventAttributeCode.append("\" ");

        return eventAttributeCode.toString();
    }
}
