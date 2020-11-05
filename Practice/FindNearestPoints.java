/*
找出距离最近的两个点
例如：
请输入点的数量:8
请输入这些点的坐标-1 3
                 -1 -1
                  1 1 
                  2 0.5
                  2 -1
                  3 3 
                  4 2
                  4 -0.5
距离最近的两个点的坐标是: (1.0,1.0)和(2.0,0.5)

*/

public class FindNearestPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("请输入点的数量");
        int numberOfPoints = input.nextInt();
        double[][] points = new double[numberOfPoints][2];
        System.out.println("请输入这些点的坐标");
        for (int i =0;i < points.length;i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
        int p1 = 0,p2 = 1;
        double shortestDistance = distance(points[p1][0],points[p1][1],
                points[p2][0],points[p2][1]);
        for (int i = 0;i<points.length;i++) {
            for (int j = i + 1;j < points.length;j++) {
                double distance = distance(points[i][0],points[i][1],points[j][0],points[j][1]);
                if (shortestDistance > distance) {
                    p1 = i;
                    p2 = j;
                    shortestDistance = distance;
                }
            }
        }
        System.out.println("距离最近的两个点的坐标是 ("+points[p1][0]+","+points[p1][1]+
                ")和("+points[p2][0]+","+points[p2][1]+")");
    }

    public static double distance(double x1,double y1,double x2, double y2) {
        return Math.sqrt(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
    }
}
