/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Влад
 */
public class ChangeScaleAndNameIMGTest {
    
    public ChangeScaleAndNameIMGTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test (expected = IllegalArgumentException.class)
    public void testLaunchWithIncorrectNumberOfArguments() throws Exception {
        String[] args = {"oldImage.jpg","newImage.jpg"};
        ChangeScaleAndNameIMG.launch(args);
    }
    
    @Test (expected = IOException.class)
    public void testLaunchWithWrongPath() throws Exception {
        String[] args = {"oldImage.jpg","newImage.jpg","1440","900"};
        ChangeScaleAndNameIMG.launch(args);
    }
    
    @Test (expected = Exception.class)
    public void testLaunchWithoutIMG() throws Exception {
        String[] args = {"test","newImage.jpg","1440","900"};
        ChangeScaleAndNameIMG.launch(args);
    }
    
    @Test (expected = Exception.class)
    public void testLaunchWithWrongStringNumber() throws Exception {
        String[] args = {"test","newImage.jpg","1ds440","900"};
        ChangeScaleAndNameIMG.launch(args);
    }
}