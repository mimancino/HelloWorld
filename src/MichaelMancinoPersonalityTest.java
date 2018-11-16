import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class MichaelMancinoPersonalityTest {
    public static void main(String[]args) throws FileNotFoundException{
        //not the actually project-just testing things
        File f = new File("output.txt");
        PrintStream prints = new PrintStream(f);
        prints.print("hergelberglmergl");//eyy printstream
    }
}
