package AST;

public class ExportAll implements ASTNode{
    ExportSpecifier exportSpecifier;
    String  source;

    public void setExportSpecifier(ExportSpecifier exportSpecifier) {
        this.exportSpecifier = exportSpecifier;
    }

    public void setSource(String source) {
        this.source = source;
    }



}































