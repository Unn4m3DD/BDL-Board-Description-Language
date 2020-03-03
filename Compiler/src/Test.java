import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String[] bounds = {"", ""};
        int min = 3, max = 3;
        if (min < 0 && 0 < max)
            bounds[0] += "[" + min + ", " + "0]";
        else if (min < 0 && max < 0)
            bounds[0] += "[" + min + ", " + (max + 1) + "]";
        if (0 < min && 0 < max)
            bounds[1] += "[" + min + ", " + (max + 1) + "]";
        else if (min < 0 && 0 < max)
            bounds[1] += "[1, " + (max + 1) + "]";
        System.out.println(Arrays.toString(bounds));
    }
}
