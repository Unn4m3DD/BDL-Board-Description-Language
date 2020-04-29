package SemanticParseTools;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Function {
    String name;
    List<String> argTypes;
    String returnType;
    public Function(String name, List<String> typeList, String returnType){
        this.name = name;
        argTypes = typeList;
        this.returnType = returnType;
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Function function = (Function) other;
        return Objects.equals(name, function.name) &&
                Objects.equals(argTypes, function.argTypes) &&
                Objects.equals(returnType, function.returnType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, argTypes, returnType);
    }
}
