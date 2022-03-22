
public class box {
    double h,w,d;

     box(double width,double height,double depth)
    {
        h=height;
        w=width;
        d=depth;
    }
    double volume()
    { double v;
    v=h*w*d;
    return v;
    }
   
    public static void main(String[] args) {
       
    box bc = new box(4.5,50.3,1.56);
    System.out.println("volume is "+bc.volume());

    }

}
