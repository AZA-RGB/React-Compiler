package AST;

import java.util.ArrayList;
import java.util.List;

public class SpecifiedExport implements ASTNode{

    List<ExportSpecifier> exportSpecifiers = new ArrayList<>();

public void addExportSpecifier(ExportSpecifier exportSpecifier){
    this.exportSpecifiers.add(exportSpecifier);
}
    @Override
    public String toString() {
        return "SpecifiedExport{\n" +
                "exportSpecifiers:\n" + exportSpecifiers +
                "\n}\n";
    }
}
