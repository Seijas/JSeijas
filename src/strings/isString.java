
package strings;

/**
 * @version 1.0
 * @author Seijas
 */
public class isString {
    
    /**
     * Check whether a String is Char
     * @param string
     * @return True: if is a Char \nFalse isn´t a Char
     */
    public static boolean isChar(String string) {
        return string.length() == 0;
    }
    
    /**
     * Check if the first letter of String is UpperCase
     * @param string
     * @return True: if is a UpperCase \nFalse if is a LowerCase
     */
    public static boolean isCapitalStarted(String string) {
        return Character.isUpperCase(string.charAt(0));
    }
    
    /**
     * Check if the first letter of String is LowerCase
     * @param string
     * @return True: if is a LowerCase \nFalse if is a UpperCase
     */
    public static boolean isLowerStarted(String string) {
        return Character.isLowerCase(string.charAt(0));
    }
}
