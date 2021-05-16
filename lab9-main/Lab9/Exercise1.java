package Lab9;

interface Power{
	public double doPower(int x, int y);
}
public class Exercise1 {

	public static void main(String[] args) {
		Exercise1 obj = new Exercise1();
		obj.doPower();
	}
	void doPower() {
		Power p = (x,y) -> Math.pow(x, y);
		double res = p.doPower(2, 3);
		System.out.println(res);
		
	}

}
