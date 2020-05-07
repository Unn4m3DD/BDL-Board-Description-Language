package SymbolTable;

import java.util.*;

public class SymbolTable {
    List<HashMap<String, Symbol>> list = new ArrayList<>();

    public Symbol resolve(String name) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).containsKey(name))
                return list.get(i).get(name);
        }
        return null;
    }

    public String resolveName(String name) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).containsKey(name))
                return list.get(i).get(name).getName();
        }
        return null;
    }

    public void pushScope() {
        list.add(new HashMap<String, Symbol>());
    }

    public void popScope() {
        list.remove(list.size() - 1);
    }

    public boolean pushSymbol(String nameInCode, Symbol var) {
        if(list.get(list.size() - 1).containsKey(nameInCode))
            return false;
        list.get(list.size() - 1).put(nameInCode, var);
        return true;
    }
}
