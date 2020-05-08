package SymbolTable;

import java.util.List;

public class Function implements Symbol {
    String name;
    List<String> args;
    String returnType;
    public Function(String name, List<String> args, String returnType) {
        this.name = name;
        this.args = args;
        this.returnType = returnType;
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

    public String getReturnType() {
        return returnType;
    }
}
