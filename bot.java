import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class bot {
    public static String takeCommand(Scanner scan) {
        String com = scan.nextLine();
        return com;
    }

    public static void quote(int id) {
        try(BufferedReader br = new BufferedReader(new FileReader("quotes.txt")))
        {
            String s;
            while((s=br.readLine())!=null){
                if (s.equals('$' + String.valueOf(id))) {
                    break;
                }
            }
            while((s=br.readLine())!=null){
                if (s.equals("$")) {
                    break;
                }
                System.out.println(s);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
