package AST;

public class ArrowComponentDeclaration extends ASTNode  {
    Identifier componentName;
    Props props;

    ComponentFunctionBody componentFunctionBody;

    public ArrowComponentDeclaration(Identifier componentName, Props props, ComponentFunctionBody componentFunctionBody) {
        this.componentName = componentName;
        this.componentFunctionBody = componentFunctionBody;
        this.props = props;
    }
    public ArrowComponentDeclaration(Identifier componentName, ComponentFunctionBody componentFunctionBody) {
        this.componentName = componentName;
        this.componentFunctionBody = componentFunctionBody;
        this.props = null;
    }


    @Override
    public String toString() {
        if(props!=null){

            return "ArrowComponentDeclaration{" +
                    "componentName: " + componentName +
                    "\n \t props: " + props +
                    ",\n \t" + componentFunctionBody +
                    '}';
        }
        return   "ArrowComponentDeclaration{" +
                "componentName: " + componentName + ",\n \t"
                + componentFunctionBody +
                '}';
    }

	public String toJS() {
       // System.out.println("hello from arrow component declaration");
        if(props!=null)
            return "const "+componentName.toJS() +"= ("+props.toJS()+")=>{\n"+componentFunctionBody.toJS()+"\n}";
        return "const "+componentName.toJS() +"= ()=>{\n"+componentFunctionBody.toJS()+"\n}";
	}
}