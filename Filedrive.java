import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java .io.I0Exception;

public class Filedrive{
	public static void main(String[]args){
		File file= new File("test.txt");
		try{
			FileReader fileReader=new FileReader(file);
			BufferedReader bufferedReader=new BufferedReader(fileReader);
			String linha= bufferedReader.readline();
			System.out.println(linha);
		}catch(FileNotFoundException e){
			System.err.printf("o arquivo não encontrou");

		}catch(I0Exception e){
			System.out.println("é impossivel pra ler o conteudo do arquivo");
		}
	}
}
