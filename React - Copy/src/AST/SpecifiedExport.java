package AST;

import java.util.ArrayList;
import java.util.List;

public class SpecifiedExport extends ASTNode {

    List<ExportSpecifier> exportSpecifiers = new ArrayList<>();
    String source;

public void addExportSpecifier(ExportSpecifier exportSpecifier){
    this.exportSpecifiers.add(exportSpecifier);
}

public SpecifiedExport(String source){
    this.source=source;
}
    public SpecifiedExport(){
    }


    @Override
    public String toString() {
        return "SpecifiedExport{\n" +
                "exportSpecifiers:\n" + exportSpecifiers +
                "\n}\n";
    }

	public String toJS() {
    StringBuilder exportSpecifiersCode = new StringBuilder();


    for(ExportSpecifier expspf:exportSpecifiers){
        if (exportSpecifiers.size()>1&&exportSpecifiers.indexOf(expspf)!=0)
            exportSpecifiersCode.append(" , ").append(expspf.toJS());
        else
            exportSpecifiersCode.append(expspf.toJS());
    }

		return "export {"+
                exportSpecifiersCode
                +"}"+((source!=null)? "from ' "+source+" '":"");
	}
}