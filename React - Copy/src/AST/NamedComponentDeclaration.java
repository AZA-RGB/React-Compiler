package AST;
public class NamedComponentDeclaration extends ASTNode  {
    Identifier componentName;
    Props props;

    ComponentFunctionBody componentFunctionBody;

    public NamedComponentDeclaration(Identifier componentName, Props props, ComponentFunctionBody componentFunctionBody) {
        this.componentName = componentName;
        this.componentFunctionBody = componentFunctionBody;
        this.props = props;
    }
    public NamedComponentDeclaration(Identifier componentName, ComponentFunctionBody componentFunctionBody) {
        this.componentName = componentName;
        this.componentFunctionBody = componentFunctionBody;
        this.props = null;
    }


    @Override
    public String toString() {
        if(props!=null){

            return "NamedComponentDeclaration{" +
                    "componentName: " + componentName +
                    "\n \t props: " + props +
                    ",\n \t" + componentFunctionBody +
                    '}';
        }
        return   "NamedComponentDeclaration{" +
                "componentName: " + componentName + ",\n \t"
                + componentFunctionBody +
                '}';
    }

	public String toJS() {
        if(props!=null)
            return "function "+componentName.toJS() +" ("+props.toJS()+"){\n"+componentFunctionBody.toJS()+"\n}\n";
        return "function "+componentName.toJS() +" (){\n"+componentFunctionBody.toJS()+"\n}\n";
	}
}