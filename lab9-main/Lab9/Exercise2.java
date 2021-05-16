package Lab9;

interface AddSpaces {
	public String doAddSpaces(String str);
}
public class Exercise2 {

	public static void main(String[] args) {
		Exercise2 obj = new Exercise2();
		obj.createSpaces();

	}
	public void createSpaces() {
		AddSpaces a = (s)->{
			char c[]= s.toCharArray();
			StringBuilder s1 = new StringBuilder();
			for(char i:c) {
				s1.append(i);
				s1.append(' ');
			}
			String s2 = s1.toString();
			return s2;
		};
		String res = a.doAddSpaces("cat");
		System.out.println("res :"+res);
	}

}
