package configuration;

import java.io.BufferedInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;

import com.opencsv.CSVReader;

import pageObjects.driverClass;

public class csvAndpdfReader extends driverClass  {

	public csvAndpdfReader(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public int csvReader(String pathfile) throws IOException{
		CSVReader reader = new CSVReader(new FileReader(pathfile));
		 
		 // this will load content into list
		  List<String[]> li=reader.readAll();
		  int totalrows=li.size();
		  return totalrows;
	}
	public String verifyPDFContent(String strURL) throws InterruptedException, IOException {

		Thread.sleep(10000);
//        driver.getCurrentUrl();
        URL url = new URL(strURL);
        InputStream is = url.openStream();
        BufferedInputStream fileToParse = new BufferedInputStream(is);
        PDDocument document = null;
        
            document = PDDocument.load(fileToParse);
          
            String output = new PDFTextStripper().getText(document);
            
            System.out.println(output);
         {
            if (document != null) {
                document.close();
            }
            fileToParse.close();
            is.close();
        }
         System.out.println(output);

        return output;
	
	
	
	
}
}
