package AST;

import java.util.ArrayList;
import java.util.List;

public class PureReactElement extends ASTNode {
   ASTNode elementName;
    Props props;
   List<ASTNode> children =new ArrayList<>();

   public void addChild(ASTNode child){
       this.children.add(child);
   }


    public PureReactElement(Props props,ASTNode elementName) {
        this.props = props;
        this.elementName=elementName;
    }

    @Override
    public String toString() {
        return "Pure_react_element:{\n\t"+"element_name:"+this.elementName.toJS()+"\n\t"+this.props.toString()+"\n\tchildren:{\n\t" +
                this.children+"\t},\n},\n";
    }

	public String toJS() {

		return contextText;
	}
}