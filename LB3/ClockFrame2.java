package LB3;

import javax.swing.*;
import java.awt.*;

public class ClockFrame2 {

    public ClockFrame2() {
        JFrame frame = new JFrame("Електронний годинник");
        JLabel label = new JLabel();
        label.setFont(new Font("Consolas", Font.BOLD, 24));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        frame.add(label);
        frame.setSize(500, 120);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        ClockExt2 clock = new ClockExt2(14, 10, 10, 0);

        Timer timer = new Timer(100, e -> {
            clock.nextMillisecond();
            label.setText(clock.toString());
        });

        timer.start();
    }
}
