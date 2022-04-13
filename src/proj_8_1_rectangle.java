import java.awt.image.AreaAveragingScaleFilter;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class proj_8_1_rectangle {
    public static void main(String[] args) {
        Rectangle r1;
        ArrayList<Rectangle> rectagles=new ArrayList<>();
        Scanner filedata;
        try {
            filedata=new Scanner(new File("rectangle_data.txt"));
            while (filedata.hasNext())
            {
                int h=filedata.nextInt();
                int b=filedata.nextInt();

                r1=new Rectangle(h,b);
                rectagles.add(r1);
            }
            filedata.close();

        }

        catch (Exception e)
        {
            System.out.println(e);
        }


        for(Rectangle rect:rectagles)
        {
            System.out.println("length:"+rect.getLen());
            System.out.println("width"+rect.getWidth());
            System.out.println("area "+rect.area());
            System.out.println("perimeter"+rect.perimeter());
        }

    }
}
