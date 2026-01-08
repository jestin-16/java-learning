import java.awt.*;
import javax.swing.*;

public class Circle extends JPanel {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        setPreferredSize(new Dimension(
                (int)(radius * 2 + 20),
                (int)(radius * 2 + 20)
        ));
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLUE);

        int diameter = (int) (radius * 2);
        g2.drawOval(10, 10, diameter, diameter); // x, y, width, height
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Circle Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Circle circle = new Circle(100);
        frame.add(circle);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
