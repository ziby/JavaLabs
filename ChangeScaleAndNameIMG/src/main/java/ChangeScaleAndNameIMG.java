import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChangeScaleAndNameIMG {
    public static void main(String args[])
    {
        try {
            launch(args); // метод для тестирования main
        } catch (Exception ex) {
            System.out.println(ex);
            usage();
        }
    }
    
    public static void launch(String[] args) throws IllegalArgumentException, IOException
    {
        if (args.length != 4) throw new IllegalArgumentException("Incorrect number of arguments");
        ImageChanger.ChangeScale(args[0], args[1], Integer.parseInt(args[2]), Integer.parseInt(args[3]));
    }
    
    public static void usage()
    {
        System.out.println("chscalenameimg -  утилита для изменения размера и имени изображения\n"
                + "chscalcenameimg [pathToOldFile] [pathToNewFile] [newWidth] [newHeigth]");
    }
}

