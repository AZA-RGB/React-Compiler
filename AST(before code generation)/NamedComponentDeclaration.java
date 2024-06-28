package AST;
public class NamedComponentDeclaration implements ASTNode {
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
}