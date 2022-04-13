import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwiceData {
    public static void main(String[] args) {
        Scanner sc;
        try{
            sc=new Scanner(new File("nums.txt"));
            PrintWriter pw=new PrintWriter("twice_nums.txt");

            while(sc.hasNext())
            {
                pw.println(sc.next());
            }

            sc.close();
            pw.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
