package numbers;

/**
 * @version 1.0
 * @author Seijas
 */
public class isNumber {
    
    /**
     * Check whether a String is Integer
     * @param string
     * @return True: if is a Integer \nFalse isn´t a Integer
     */
    public static boolean isInteger(String string) {
        try {
            Integer.parseInt(string);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
    
    /**
     * Check whether a String is Float
     * @param string
     * @return True: if is a Float \nFalse isn´t a Float
     */
    public static boolean isFloat(String string) {
        try {
            Float.parseFloat(string);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
    
    /**
     * Check whether a String is Double
     * @param string
     * @return True: if is a Double \nFalse isn´t a Double
     */
    public static boolean isDouble(String string) {
        try {
            Double.parseDouble(string);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
    
    /**
     * Check whether a String is Boolean
     * @param string
     * @return True: if is a Boolean \nFalse isn´t a Boolean
     */
    public static boolean isBoolean(String string) {
        try {
            Boolean.parseBoolean(string);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
    
    /**
     * Check whether a String is Byte
     * @param string
     * @return True: if is a Byte \nFalse isn´t a Byte
     */
    public static boolean isByte(String string) {
        try {
            Byte.parseByte(string);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
    
    /**
     * Check whether a String is Shortt
     * @param string
     * @return True: if is a Short \nFalse isn´t a Short
     */
    public static boolean isShort(String string) {
        try {
            Short.parseShort(string);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
    
    /**
     * Check whether a String is Long
     * @param string
     * @return True: if is a Long \nFalse isn´t a Long
     */
    public static boolean isLong(String string) {
        try {
            Long.parseLong(string);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
    
    
}