package strings;

/**
 * @version 1.0
 * @author Seijas
 */
public class format {
    
    /**
     * Format text up letters after \'.\' 
     * @param string The text to format
     * @return The text formated
     */
    public static String capitalizeString(String string){ 
        
        char[] chars = string.toLowerCase().toCharArray();
        boolean found = false; 
        
        for (int i = 0; i < chars.length; i++) {
            if (!found && Character.isLetter(chars[i])) { 
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            }else{
                if(Character.isWhitespace(chars[i]) || chars[i] == '.' || chars[i]=='\''){
                    found = false;
                }
            }
        }
        return String.valueOf(chars);
    }
    
    /**
     * Format text up letters after the chars in array 
     * @param string The text to format
     * @param then Array with chars before to up letter
     * @return The text formated
     */
    public static String capitalizeString(String string, char[] then){ 
        
        char[] chars = string.toLowerCase().toCharArray();
        boolean found = false; 
        
        for (int i = 0; i < chars.length; i++) {
            if (!found && Character.isLetter(chars[i])) { 
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            }else{
                for(int j = 0; j<then.length; j++){
                    if(chars[i] == then[i])
                        found = false;
                }
            }
        }
        return String.valueOf(chars);
    }
    
}
