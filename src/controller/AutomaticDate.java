package controller;
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AutomaticDate {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Automatic Date");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);

            JPanel panel = new JPanel();
            panel.setLayout(new FlowLayout());

            JLabel dateLabel = new JLabel();
            dateLabel.setFont(new Font("Arial", Font.BOLD, 20));
            panel.add(dateLabel);

            // Create a Timer to update the date label every second
            Timer timer = new Timer(1000, (e) -> {
                // Get the current date
                Date currentDate = new Date();

                // Create a date formatter to format the date
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                // Format the current date
                String formattedDate = dateFormat.format(currentDate);

                // Update the date label
                dateLabel.setText(formattedDate);
            });

            // Start the timer
            timer.start();

            frame.add(panel);
            frame.setVisible(true);
        });
    }
}
