public class uc5 {
     public static void main(String[] args) {

        // Inline declaration and initialization of banner lines
        String[] bannerLines = {
            String.join(" ", " ***** ", "  ***** ", "  ***** ", "  ***** "),
            String.join(" ", "*     *", " *     *", " *     *", " *      "),
            String.join(" ", "*     *", " *     *", " *     *", " *      "),
            String.join(" ", "*     *", " *     *", " *****  ", "  ***** "),
            String.join(" ", "*     *", " *     *", " *      ", "       *"),
            String.join(" ", "*     *", " *     *", " *      ", "       *"),
            String.join(" ", " ***** ", "  ***** ", " *      ", "  ***** ")
        };

        // Print banner using enhanced for loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}

