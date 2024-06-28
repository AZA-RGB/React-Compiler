package AST;

public class jsx implements ASTNode {
    ASTNode value;

    public jsx(ASTNode value) {
        this.value = value;
    }
    @Override
    public String toString(){
        return
               "jsx_Element:{"+'\n' +'\t'+ this.value+"\n},";
    }
}
