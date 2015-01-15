import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.imgscalr.Scalr;

public class ImageChanger
{    
    public static void ChangeScale(String oldPathToImage, String newPathToImage, int newWidth, int newHeight) throws IOException 
    {
        BufferedImage bufImage = ImageIO.read(new File(oldPathToImage));
        BufferedImage newBufImage = Scalr.resize(bufImage, newWidth, newHeight, (BufferedImageOp) null);
        ImageIO.write(newBufImage, "png", new File(newPathToImage));
    }
}