import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            WeatherAppGui weatherAppGui = new WeatherAppGui();
            weatherAppGui.setVisible(true);
        });
    }
}
