import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class WebScraper {

    public static void main(String[] unused) {
        String url = "http://erdani.com/tdpl/hamlet.txt";
        System.out.println("Pulling text from: " + url);
        String urlWords = urlToString(url);



    }

    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }


    /** Count the number of words in the string returned by urlToString.
     *
     *
     */

    public static int wordCount(final String urlWords) {

        String word = "heart";

        int countWords = 0;

        


    }

}
