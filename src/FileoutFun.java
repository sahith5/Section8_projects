import java.io.PrintWriter;

public class FileoutFun {
    public static void main(String[] args) {
        try{
            PrintWriter pw=new PrintWriter("output.txt");
            pw.println("hello");
            pw.println("iam Sahith");

            pw.close();
        }
        catch (Exception e)
        {
            System.out.println("exception is "+e);
        }
    }
}
