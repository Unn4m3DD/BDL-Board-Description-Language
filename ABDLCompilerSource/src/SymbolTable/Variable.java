package SymbolTable;

public class Variable implements Symbol {
    String name;
    String type;
    public Variable(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
