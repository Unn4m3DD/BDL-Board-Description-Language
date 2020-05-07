package SymbolTable;

import java.util.List;

public class Function implements Symbol {
    String name;
    List<String> args;

    public Function(String name, List<String> args) {
        this.name = name;
        this.args = args;
    }

    public boolean pushArg(String arg){
        return args.add(arg);
    }

    public List<String> getArgs() {
        return args;
    }

    @Override
    public String getName() {
        return name;
    }
}
