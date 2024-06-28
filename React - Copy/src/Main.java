import AST.ASTNode;
import SymbolTable.SymbolTable;
import antlr.ReactParser;
import antlr.ReactLexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import visitor.BaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileWriter;
import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String args []) throws IOException {
        CharStream input=CharStreams.fromString("");
        String source = "React - Copy/src/testCompiler2.js";
        System.out.println("generating the JS code for your components ....");
        CharStream cs = fromFileName(source);
        ReactLexer lexer = new ReactLexer(cs);
        ReactParser parser = new ReactParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.program();
        BaseVisitor visitor = new BaseVisitor();
        SymbolTable symbolTable = SymbolTable.getInstance();
        ASTNode tr= (ASTNode) visitor.visit(tree);
        if(!visitor.symbolTable.hasSemanticError){
//            System.out.println("-----------------------------------------------------------------------------------------------");
//            System.out.println("The Parser Output:");
//            System.out.println("-----------------------------------------------------------------------------------------------");
            String fileName = "example.js";


            // Create a FileWriter object and write the content to the JS file
            try (FileWriter fileWriter = new FileWriter(fileName)) {
                fileWriter.write(tr.toJS());
                System.out.println("Successfully wrote to the file: " + fileName);
            } catch (IOException e) {
                System.out.println("An error occurred while writing to the file.");
                e.printStackTrace();
            }
            //System.out.println(tr.toJS());
//            System.out.println("-----------------------------------------------------------------------------------------------");
//            System.out.println("The SymbolTable:");
//            System.out.println("-----------------------------------------------------------------------------------------------");
//            symbolTable.print();
//            System.out.println("-----------------------------------------------------------------------------------------------");
        }

    }
}
