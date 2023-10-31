package SafeInput;

import java.util.Scanner;

public class SafeInput {
    /**
     * Get a non-zero-length string from the user.
     *
     * @param pipe    a Scanner opened to read from System.in
     * @param prompt  prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = ""; // Set this to zero length. Loop runs until it isn’t
        do {
            System.out.print("\n" + prompt + ": "); // show prompt and add space
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;
    }
}
