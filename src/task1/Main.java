package task1;

import javax.swing.*;
import java.awt.*;

import static util.ArrayUtils.readIntArrayFromFile;

public class Main extends JPanel{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Рисуем прямоугольник
        int x = 10;
        int y = 20;
        int width = 200;
        int height = 100;
        g2d.drawRect(x, y, width, height);
    }

    public static void main(String[] args) {
        String input = "input.txt";
        JFrame frame = new JFrame("Прямоугольник");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.add(new Main());
        frame.setVisible(true);

        int[] arr = readIntArrayFromFile("input.txt");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        Point point1 = new Point(arr[0],arr[1]);
        Point point2 = new Point(arr[2],arr[3]);
        Point point3 = new Point(arr[4],arr[5]);
        Point point4 = new Point(arr[6],arr[7]);
    }
}
