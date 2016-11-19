import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class file_load_test{
    public static void main(String args[]){
	try{
	    File file = new File("/Users/ei_finance_201607/Documents/localIPyNB/nky_futures_4data.csv");
	    FileReader filereader = new FileReader(file);

	    int ch;
	    while((ch = filereader.read()) != -1){
		System.out.print((char)ch);
	    }
	    filereader.close();
	}

	catch(FileNotFoundException e){
	    System.out.println(e);
	}

	catch(IOException e){
	    System.out.println(e);
	}
    }
}

