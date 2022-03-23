import java.util.Scanner;
public class Studentmarks {
public static void main(String[] args) {
 Scanner in=new Scanner(System.in);
 System.out.println("enter your name:");
 String name=in.next();
 System.out.println("enter marks of Telugu :");
 int Tel=in.nextInt();
 if(Tel>50)
 {
 System.out.println("Marsk should not be more than 50");
 } 
 System.out.println("enter marks of Hindi: ");
 int Hin=in.nextInt();
 if(Hin>50)
 {
 System.out.println("Marks should not be more than 50");
 }
 System.out.println("enter marks of English :");
 int Eng=in.nextInt();
 if(Eng>50)
 {
 System.out.println("Marks should not be more than 50");
 }
 
 System.out.println("enter marks of Maths:");
 int Mat=in.nextInt();
 if(Mat>50)
 {
 System.out.println("Marks should not be more than 50");
 }
 System.out.println("enter marks of Science :");
 int Sc=in.nextInt();
 if(Sc>50)
 {
 System.out.println("Marks should not be more than 50");
 }
 System.out.println("enter marks of Social:");
 int Soc=in.nextInt();
 if(Soc>500)
 {
 System.out.println("Marks should not be more than 50");
 }
 int tot=Tel+Eng+Hin+Mat+Sc+Soc;
 System.out.println("total:"+tot+" ");
 float percentage=tot*100/600;
 System.out.println("percentage:"+percentage+" ");
}
}
