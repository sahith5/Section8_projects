import java.io.File;
import java.util.Scanner;

public class FileInputFun {
    public static void main(String[] args) {
        int sum=0;

        Scanner infile;
        try{
            infile= new Scanner(new File("input.txt"));
            while (infile.hasNext())
            {
                sum+=infile.nextInt();
            }

        }
        catch(Exception e)
        {
             System.out.println(e);
        }
        System.out.println(sum);

    }

}
