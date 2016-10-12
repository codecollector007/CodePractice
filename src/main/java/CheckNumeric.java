import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.apache.commons.lang3.StringUtils;
/**
 * Class to check if a String is numeric
 */
public class CheckNumeric {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();

            if (StringUtils.isNumeric(input)) {
                System.out.println ("it is numeric");
            } else {
                System.out.println ("it is not numeric");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
