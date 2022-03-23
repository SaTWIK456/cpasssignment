
import java.util.Scanner;

public class Movies{


	public static void main(String[] args) {
	        App obj = new App();

	        App[] moviename = new App[2];
	        moviename[0] = obj;
	        Theater mve=new Theater();
	        moviename[1] = mve;

	        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
	        System.out.println("--1.list of movies and their prices--------- \n-------2.acces and book tickets through theaters---");

	        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	        Scanner d = new Scanner(System.in);
	        int h = d.nextInt();
	        switch (h) {
	            case 1: { 
	                obj.movies();
	                break;
	            }
	            case 2: {
	             
	               mve.th();
	            }
	        }

	    }

	}
