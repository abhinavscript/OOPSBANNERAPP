public class uc4 {
     public static void main(String[] args) {

        String[] bannerLines = {

            String.join(" ",
                    " ***** ", "  ***** ", "  ***** ", "  ***** "),

            String.join(" ",
                    "*     *", " *     *", " *     *", " *      "),

            String.join(" ",
                    "*     *", " *     *", " *     *", " *      "),

            String.join(" ",
                    "*     *", " *     *", " *****  ", "  ***** "),

            String.join(" ",
                    "*     *", " *     *", " *      ", "       *"),

            String.join(" ",
                    "*     *", " *     *", " *      ", "       *"),

            String.join(" ",
                    " ***** ", "  ***** ", " *      ", "  ***** ")
        };

        // Print banner using enhanced for loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}

