package SymbolTable;

public class Variable implements Symbol {
    static int id = 0;
    String name;

    public Variable() {
        this.name = "v" + id;
        id++;
    }

    @Override
    public String getName() {
        return name;
    }
}
