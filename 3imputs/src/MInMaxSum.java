
public class MInMaxSum {
	public static int min(int x,int y,int z)  {
		return (Math.min(x, Math.min( y,z)));
	}
	public static int max(int x, int y, int z) {
		return(Math.max(x,Math.max(y, z)));
	}
	public static int sum( int x, int y, int z) {
		return( x + y +z);
	}

}
