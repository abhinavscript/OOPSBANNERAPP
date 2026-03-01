 public class uc3{

    public static void main(String[] args) {
        renderUC3Banner();
    }

    public static void renderUC3Banner() {
        // Delimiter is a single space to separate the letters
        String delimiter = "  "; 

        // Row 1
        System.out.println(String.join(delimiter, "  *** ", "  *** ", " ***** ", "  **** "));
        // Row 2
        System.out.println(String.join(delimiter, " *   * ", "*    *", "*   *", "  * "));
        // Row 3
        System.out.println(String.join(delimiter, " *   * ", "*    *", "***** ", "  *** "));
        // Row 4
        System.out.println(String.join(delimiter, " *   * ", "*    *", "* ", "         * "));
        // Row 5
        System.out.println(String.join(delimiter, "  *** ", "  *** ", " * ", "     **** "));
    }
} 
    

