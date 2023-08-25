import java.awt.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
//4.1
public class u41 {
    
    public static void main(String[] args) {   
        String sourceExtension = "jpg"; // первое расширение
        String targetExtension = "png"; // второе расширение

        File currentDir = new File(".");
        File[] imageFiles = currentDir.listFiles((dir, name) ->
                name.toLowerCase().endsWith("." + sourceExtension));

        if (imageFiles != null) {
            for (File imageFile : imageFiles) {
                try {
                    BufferedImage originalImage = ImageIO.read(imageFile);

                    String newFileName = getNewFileName(imageFile.getName(), targetExtension);
                    File outputFile = new File(newFileName);

                    BufferedImage convertedImage = new BufferedImage(
                            originalImage.getWidth(), originalImage.getHeight(), BufferedImage.TYPE_INT_RGB);

                    Graphics2D g2d = convertedImage.createGraphics();
                    g2d.drawImage(originalImage, 0, 0, null);

                    // 4.2
                    int squareSize = Math.min(originalImage.getWidth(), originalImage.getHeight()) / 2;
                    int squareX = (originalImage.getWidth() - squareSize) / 2;
                    int squareY = (originalImage.getHeight() - squareSize) / 2;
                    g2d.setColor(Color.WHITE);
                    g2d.fillRect(squareX, squareY, squareSize, squareSize);

                    
                    g2d.setColor(Color.BLACK);
                    String text = "Hello,\nWorld!";
                    Font font = new Font("Arial", Font.BOLD, 20);
                    g2d.setFont(font);
                    FontMetrics metrics = g2d.getFontMetrics(font);
                    int textWidth = metrics.stringWidth(text);
                    int textHeight = metrics.getHeight();
                    int textX = (originalImage.getWidth() - textWidth) / 2;
                    int textY = (originalImage.getHeight() - textHeight) / 2 + metrics.getAscent();
                    g2d.drawString(text, textX, textY);

                    g2d.dispose();

                    ImageIO.write(convertedImage, targetExtension, outputFile);
                    System.out.println("конвертировано: " + imageFile.getName() + " to " + newFileName);
                } catch (IOException e) {
                    System.err.println("ошибка конвертации: " + imageFile.getName());
                }
            }
        }
    }

    private static String getNewFileName(String oldFileName, String newExtension) {
        int extensionIndex = oldFileName.lastIndexOf(".");
        String baseName = oldFileName.substring(0, extensionIndex);
        return baseName + "." + newExtension;
    }
}
