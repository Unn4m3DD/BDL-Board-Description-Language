package SymbolTable;

public class SymbolTableTest {
    public static void main(String[] args) {
        SymbolTable st = new SymbolTable();
        st.pushScope();
        for (int i = 0; i < 5; i++) {
            System.out.println("t" + i + (st.pushSymbol("t" + i, new Variable("v" + i)) ? "" : " not") + " added");
        }

        for (int i = 0; i < 6; i++) {
            String nameInTarget = st.resolveName("t" + i);
            if (nameInTarget != null) {
                System.out.println("t" + i + " name in target is " + nameInTarget);
            } else {
                System.out.println("t" + i + " not defined");
            }
        }
        st.pushScope();
        for (int i = 0; i < 6; i++) {
            String nameInTarget = st.resolveName("t" + i);
            if (nameInTarget != null) {
                System.out.println("t" + i + " name in target is " + nameInTarget);
            } else {
                System.out.println("t" + i + " not defined");
            }
        }
        st.popScope();
        st.popScope();
        for (int i = 0; i < 6; i++) {
            String nameInTarget = st.resolveName("t" + i);
            if (nameInTarget != null) {
                System.out.println("t" + i + " name in target is " + nameInTarget);
            } else {
                System.out.println("t" + i + " not defined");
            }
        }
    }
}
