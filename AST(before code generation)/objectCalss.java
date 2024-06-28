package AST;

public class objectCalss implements ASTNode{
    String object;

    public objectCalss(String object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "\n\t\tobjectCalss{\n\t\t" +
                "ClassName : " + object +
                "\n\t}";
    }
}
