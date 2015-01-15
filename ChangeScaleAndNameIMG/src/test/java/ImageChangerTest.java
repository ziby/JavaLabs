/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ImageChangerTest {
    
    String oldPathToImage, newPathToImage;
    int newWidth, newHeight;
    
    @Before
    public void setUp() {
        oldPathToImage = "test_image.jpg";
        newPathToImage = "res_test_image.jpg";
        newWidth = 1440;
        newHeight = 810;
    }
    
    @After
    public void tearDown() {
        
    }

    @org.junit.Test
    public void testChangeScale() throws Exception {
        ImageChanger.ChangeScale(oldPathToImage, newPathToImage, newWidth, newHeight);
        Image img = ImageIO.read(new File(newPathToImage));
        assertEquals(img.getWidth(null), newWidth);
    }
}
