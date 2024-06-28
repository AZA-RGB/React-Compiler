package AST;

public class ExportSpecifier implements  ASTNode{

    String local,exported;

    public void setLocal(String local) {
        this.local = local;
    }

    public void setExported(String exported) {
        this.exported = exported;
    }

    public String getLocal() {
        return local;
    }

    @Override
    public String toString() {
        return "ExportSpecifier{\n" +
                "local:" + local +
                ",\n exported:" + exported +
                "\n}";
    }
}
