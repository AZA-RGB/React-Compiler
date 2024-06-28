package AST;

public class ImportSpecifier extends ASTNode {
    String local,imported=null;

    public ImportSpecifier(String local, String imported) {
        this.local = local;
        this.imported = imported;
    }

    @Override
    public String toString() {
        String sb = "";
        sb+="ImportSpecifier{\n";
        sb+="\tlocal: "+this.local+",\n";
        sb+="\timported: "+this.imported+",\n";
        sb+="}";
        return sb;
    }

	public String toJS() {
        if (imported == null || imported.isEmpty()) {
            return local;
        }
        if (local.equals(imported)) {
            return imported;
        }
        return imported + " as " + local;
	}
}