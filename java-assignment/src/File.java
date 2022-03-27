import java.io.FileOutputStream;
	import java.io.IOException;

	public class File {
		@SuppressWarnings("unused FILE")
		public static void main(String[] args) {


			try {
			FileOutputStream text =new FileOutputStream("C:\\Users\\hp\\Desktop\\TEXTTCode.txt");

			        if(text != null) {
			 System.out.println("file is created successfully");
			 } else

		    TEXTTCode.write(45);
			TEXTTCode.write(78);

			String s= "SATWIK";
			byte b[]=s.getBytes();
			text.write(b);
			System.out.println(text.toString());
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}    

			}
	}