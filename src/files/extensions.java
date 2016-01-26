package files;

/**
 * @version 1.0
 * @author Seijas
 */
public class extensions {
    
    /** //at the moment, only work with simple extensions, unlike .tar.gz
     * Get the file extension from the path
     * @param url The path of the file to get the extension
     * @return A String like .txt
     */
    public static String getExtension(String url) {
        String extension = "";
        int i = url.lastIndexOf('.');
        int p = Math.max(url.lastIndexOf('/'), url.lastIndexOf('\\'));
        if (i > p)
            extension = url.substring(i);
        return extension;
    }
    
}
