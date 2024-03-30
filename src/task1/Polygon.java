package task1;

public class Polygon {
    public int getH(Point point1, Point point2){
        return (int)(Math.pow((Math.pow(point1.x-point2.x,2)+Math.pow(point1.y-point2.y,2)),1.0/2.0));
    }
    public int getW(Point point2, Point point3){
        return (int)(Math.pow((Math.pow(point2.x-point3.x,2)+Math.pow(point2.y-point3.y,2)),1.0/2.0));
    }
    public double areaOfPolygon(Point point1, Point point2, Point point3){
        return getH(point1,point2)*getW(point2,point3);
    }
    public double perimeterOfPolygon(Point point1, Point point2, Point point3){
        return 2*(getH(point1,point2)+getW(point2,point3));
    }
    public int findX(Point point1, Point point2, Point point3,Point point4){
        return Math.min(point1.x,Math.min(point2.x,Math.min(point3.x,point4.x)));
    }
    public int findY(Point point1, Point point2, Point point3,Point point4){
        return Math.min(point1.y,Math.min(point2.y,Math.min(point3.y,point4.y)));
    }
}
