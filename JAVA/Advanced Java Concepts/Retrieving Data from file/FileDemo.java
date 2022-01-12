import java.io.FileReader;
public class FileDemo
{
    public static void main(String[] args)
    {
        try {
			FileReader fread = new FileReader("log.txt");
			int i ;
			while((i = fread.read()) != -1) {
				System.out.print((char)(i));
				
			}
			fread.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
    }
}