package AST;

public class ExportSpecifier extends  ASTNode{

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

	public String toJS() {
        // exported = null, same as local? we export the local name
        if (exported == null || exported.isEmpty() || local.equals(exported)) {
            return local;
        }
        return local + " as " + exported;
	}
}