import org.w3c.dom.ranges.RangeException;

public class Studentmarks {
	private String name;
	private double[] marks = new double[6];
	private static String[] Subs = new String[] {"Maths","Physics","Chemistry","Hindi","English","German"};
	
	Studentmarks(String name){
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setMarks(double[] givenMarks) throws RangeException{
		for(int i=0;i<6;i++) {
			if(givenMarks[i]>=0 && givenMarks[i]<=50) {
				this.marks[i] = givenMarks[i];
			}
			else {
				throw new RangeException((short)0, "The marks are "+Studentmarks.Subs[i]+" out of range");
			}
		}
	}
	
	public void getInfo() {
		System.out.println("Name : "+this.getName());
		for(int i=0;i<6;i++) {
			System.out.println(Studentmarks.Subs[i]+" : "+this.marks[i]);
		}
	}
	
}