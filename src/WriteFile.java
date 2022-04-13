import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {
        ArrayList<String > arr=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        System.out.println("add 5 names");
        for(int i=0;i<5;i++)
        {
            arr.add(s.nextLine());
        }
        try {
            PrintWriter pw = new PrintWriter("names.txt");
            for(String name:arr)
            {
                System.out.println(name);
                pw.println(name);
            }
            System.out.println("added");
            pw.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
