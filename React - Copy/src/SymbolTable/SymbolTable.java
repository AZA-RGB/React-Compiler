package SymbolTable;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.ref.Reference;
import java.sql.Ref;
import java.util.*;

public class SymbolTable {
    private final HashMap<String, HashMap<String, Symbol>> scopes;

    private final Stack<String> st;

    private static SymbolTable instance;
    public boolean hasSemanticError = false;

    private boolean hasArguments = false;
    public void arg(){
        hasArguments=!hasArguments;
    }
    public boolean statusArgs(){
        return  hasArguments;
    }
    private SymbolTable() {
        scopes = new HashMap<>();
      String[] basics={"size","length","parse","map","sort","console","log","onClick"};
        st = new Stack<>();
        st.push("Public");
        scopes.put(getTopScope(), new HashMap<>());
        Symbol symbol = new Symbol("basics","");
        for (int i = 0; i < basics.length; i++) {
            put(basics[i], symbol);
        }
    }

    public void enterScope(String scopeName) {
        if (!scopes.containsKey(scopeName)) {
            scopes.put(scopeName, new HashMap<>());
            st.push(scopeName);
        }

    }

    public void exitScope() {
        st.pop();
    }

    public String getTopScope() {
        return st.peek();
    }
    public String getTopScope2() {

        Stack<String> st2=  new Stack<>();
        st2.addAll(st);

        st2.pop();

//      System.out.println(st2+"++++++++++++++");
        return st2.peek();
    }

    public void put2(String name, Symbol sym) {
        scopes.get(getTopScope2()).put(name, sym);
    }



    public void put(String name, Symbol sym) {
        scopes.get(getTopScope()).put(name, sym);
    }


    public void removeScope() {
        scopes.remove(getTopScope());
    }


    public static SymbolTable getInstance() {
        if (instance == null) {
            instance = new SymbolTable();
        }
        return instance;
    }

    public void print() {
        System.out.printf("| %-40s | %-40s | %-40s \n", "Key", "Value", "type");
        System.out.println("-----------------------------------------------------------------------------------------------");
        for (String key : scopes.keySet()) {
            if (!scopes.get(key).isEmpty()) {
                System.out.println("##############");
                System.out.println("Scope => " + key);
                System.out.println("##############");
                for (String k : scopes.get(key).keySet()) {
                    Symbol symbol = scopes.get(key).get(k);
                    System.out.printf("| %-40s | %-40s | %-40s \n", k, symbol.getValue(), symbol.getType());
                }
            }

        }

    }

    public boolean containsSymbol(String name) {
        if (scopes.get(getTopScope()).containsKey(name)) {
            return true;
        }
        return false;
    }

    public boolean isDeclare(String name) {
        String[] elementsArray = new String[st.size()];
        st.toArray(elementsArray);
        for (String element : elementsArray) {
            for (String k : scopes.get(element).keySet()) {
                if (k.equals(name)) {
                    return true;
                }
            }

        }
        return false;
    }

//    public boolean isDeclare(String name) {
//
//        System.out.println(scopes.get("Public").keySet());
//        System.out.println("&&&&&&&&&&&&&&&&&");
//
//        String[] elementsArray = new String[st.size()];
//        st.toArray(elementsArray);
//        for (String element : elementsArray) {
//            System.out.println("** "+element);}
//        System.out.println("0000000000000000000000");
//        for (String element : elementsArray) {
//            System.out.println("%%% "+element);
//            System.out.println(scopes.get(element).keySet());
//            for (String k : scopes.get(element).keySet()) {
//                System.out.println(k+"---"+name);
//                if (k.equals(name)||k.equals(name+"lxy")) {
//                    System.out.println("1=================");
//                    return true;
//                }
//            }
//
//        }
//        System.out.println("2=================");
//        return false;
//    }

    public void semanticError(String errorMessage, int lineNumber) {
        System.err.println("Semantic Error at line " + lineNumber + ": " + errorMessage);
        hasSemanticError = true;
    }


}
