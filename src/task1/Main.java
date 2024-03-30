package task1;

import javax.swing.*;
import java.awt.*;

import static util.ArrayUtils.readIntArrayFromFile;

public class Main extends JPanel{
    public static Point point1;
    public static Point point2;
    public static Point point3;
    public static Point point4;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Прямоугольник");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.add(new Main());
        frame.setVisible(true);




    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        Polygon polygon = new Polygon();

        String input = "C:\\Task\\AiSD\\src\\input.txt";
        int[] arr = readIntArrayFromFile(input);
        point1 = new Point(arr[0],arr[1]);
        point2 = new Point(arr[2],arr[3]);
        point3 = new Point(arr[4],arr[5]);
        point4 = new Point(arr[6],arr[7]);
        g2d.drawRect(polygon.findX(point1, point2, point3, point4), polygon.findY(point1,point2,point3,point4), polygon.getH(point1,point2), polygon.getW(point2,point3));
    }
}
