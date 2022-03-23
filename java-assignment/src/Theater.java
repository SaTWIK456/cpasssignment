
import java.util.Scanner;

public class Theater extends MovieApp{
	
		private int noOftickets;
		    void th() {
		        System.out.println("**the theaters available are** \n 1.kishore theater \n 2.annapurna theater");
		        int k, an;
		        Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();
		        if (n == 1) {
		            System.out.println("**kishore theater**");
		            System.out.println("**select a movie**");
		            System.out.println("movie available are \n 1.RadheShyam\n 2.The Kashmir Files ");
		            Scanner a = new Scanner(System.in);
		            int o = mve.nextInt();
		            if (o == 1) {
		                System.out.println("RadheShyam movie @ kaurnya theater");
		                System.out.println("enter the number of tickets to be booked");
		                Scanner j = new Scanner(System.in);
		                int r = j.nextInt();
		                int left= noOftickets-r;
		                int amount=40*r;
		                System.out.println("to continue to book for this movie prees 1");
		                Scanner d = new Scanner(System.in);
		                int h = d.nextInt();
		                System.out.println("\n\n\n");
		                if (h == 1) {
		                    System.out.println("******************");
		                    System.out.println("theater ------------------- kishore theater");
		                    System.out.println("movie --------------------- shreak");
		                    System.out.println("cost ---------------------- Rs."+amount);
		                    System.out.println("******************");
		                }

		            }
		            if (o == 2) {
		                System.out.println("RRR @kishore theater");
		                 System.out.println("enter the number of tickets to be booked");
		                Scanner j = new Scanner(System.in);
		                int r = j.nextInt();
		                int left= noOftickets-r;
		                int amount=50*r;
		                System.out.println("to continue to book for this movie press 1");
		                Scanner d = new Scanner(System.in);
		                int h = d.nextInt();
		                System.out.println("\n\n\n");
		                if (h == 1) {
		                    System.out.println("******************");
		                    System.out.println("theater ------------------- kishore theater");
		                    System.out.println("movie --------------------- staurt little");
		                    System.out.println("cost ---------------------- Rs"+amount);
		                    System.out.println("******************");
		                }

		            }
	}
		    
	        if (n == 2) {
	            System.out.println("**annapurna theater**");
	            System.out.println("**select a movie**");
	            System.out.println("movie available are \n 3.The KasHmir Files \n 4.DJ Tillu movie");
	            Scanner b = new Scanner(System.in);
	            int p = b.nextInt();
	            Scanner a = new Scanner(System.in);
	            int o = a.nextInt();
	            if (o == 3) {
	                System.out.println("The Kashmir Files @ annapurna theater");
	                 System.out.println("enter the number of tickets to be booked");
	                Scanner j = new Scanner(System.in);
	                int r = j.nextInt();
	                int left= noOftickets-r;
	                int amount=60*r;
	                System.out.println("to continue to book for this movie prees 1");
	                Scanner d = new Scanner(System.in);
	                int h = d.nextInt();
	                System.out.println("\n\n\n");
	                if (h == 1) {
	                    System.out.println("******************");
	                    System.out.println("theater ------------------- annapurna theater");
	                    System.out.println("movie --------------------- game movie");
	                    System.out.println("cost ---------------------- Rs."+amount);
	                    System.out.println("******************");
	                }

	            }
	            if (o == 4) {
	                System.out.println("DJ Tillu @annapurna theater");
	                 System.out.println("enter the number of tickets to be booked");
	                Scanner j = new Scanner(System.in);
	                int r = j.nextInt();
	                int left= noOftickets-r;
	                int amount=70*r;
	                System.out.println("to continue to book for this movie prees 1");
	                Scanner d = new Scanner(System.in);
	                int h = d.nextInt();
	                System.out.println("\n\n\n");
	                if (h == 1) {
	                    System.out.println("******************");
	                    System.out.println("theater ------------------- annapurna theater");
	                    System.out.println("movie --------------------- fun movie");
	                    System.out.println("cost ---------------------- Rs."+amount);
	                    System.out.println("******************");
	                }

	            }
	        }

	    

		    }
	
}
