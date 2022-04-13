import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class proj_8_1_circle {
    public static void main(String[] args) {
        Circledemo c1;
        ArrayList<Circledemo> circles = new ArrayList<>();
        Scanner sc;
        try {
            PrintWriter pw=new PrintWriter("CircleArea.txt");

            try {
                sc = new Scanner(new File("circle_data.txt"));
                while (sc.hasNext()) {
                    int r = sc.nextInt();
                    c1 = new Circledemo(r);
                    circles.add(c1);
                }


                sc.close();
            }//endtry
            catch (Exception e) {
                System.out.println(e);
            }//endcatch

            for (Circledemo c : circles) {
                System.out.println("Radius"+c.getRadius());
                System.out.println("Circumference"+c.circumference());
                System.out.println("Area"+c.area());
                pw.println("Radius"+c.getRadius());
                pw.println("Circumference"+c.circumference());
                pw.println("Area"+c.area());
            }
            pw.close();


        }//endtry
        catch (Exception e)
        {
            System.out.println(e);
        }//endtry
    }
}
