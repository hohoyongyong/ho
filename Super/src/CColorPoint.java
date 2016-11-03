public class CColorPoint extends Cpoint {

	private String color;

	public CColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public	String toString() {
		return super.toString() + color;
	}
	public static void main(String[] args) {
		Cpoint a;
		a = new Cpoint(2,3);
		System.out.println(a);
		a = new CColorPoint(3, 4, "reds");
		System.out.println(a);
	}
}