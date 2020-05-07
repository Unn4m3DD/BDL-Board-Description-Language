package SymbolTable;

public class Variable implements Symbol {
    String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
