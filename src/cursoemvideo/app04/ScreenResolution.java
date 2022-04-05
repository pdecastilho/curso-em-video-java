package cursoemvideo.app04;

import java.awt.*;

public class ScreenResolution {
    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        System.out.println("The screen resolution is: " + ((int) width) + "x" + ((int) height));
    }
}
