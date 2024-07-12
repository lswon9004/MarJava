package day0325.oob.inheritance;
class Point{
	
	int x;
	int y;
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
}
class Point3d extends Point{
	int z;
	Point3d(){
		this(0,0,0);
	}
	Point3d(int x, int y,int z){
		super(x,y);//무조건 super생성자가 한번은 수행된다.
		this.z=z;
	}
	@Override
	public String toString() {
		return "Point3d [z=" + z + ", x=" + x + ", y=" + y + "]";
	}
}
public class PointTest {
	public static void main(String[] ags) {
		Point3d p3d = new Point3d(1, 2, 3);
		System.out.println(p3d);

	}
}
