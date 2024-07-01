package AST;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ImportStatement extends ASTNode  {
    ASTNode importStatemenet;


    @Override
    public String toString() {
        return importStatemenet.toString();
    }

    @Override
    public String toJS() {
        return importStatemenet.toJS();
    }

    public ImportStatement(ASTNode importStatemenet) {
        this.importStatemenet = importStatemenet;
    }
}