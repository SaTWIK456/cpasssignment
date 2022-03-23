
public class Cylinder extends Circle implements Volume {
	public Double height;
	private Double radius;
	public Cylinder( Double height,Double radius,String name){
		this.height=height;
		this.name=name;
		this.radius=radius;
		}
	@Override
	public double getVolume() {
		double v;
		v=Math.PI*(radius*radius)*height;
		return v;
		
	}
	
	

}