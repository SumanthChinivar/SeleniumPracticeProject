package readingDataFromFiles;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file = new File("./TestData/MultipleData.xlsx");
		FileInputStream fis = new FileInputStream(file);

		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Practice");
		
		int rowNum=sheet.getPhysicalNumberOfRows();
		int columnNum=sheet.getRow(0).getPhysicalNumberOfCells();
		
		for(int i=0;i<rowNum;i++)
		{
			for(int j=0;j<columnNum;j++)
			{
				String data=sheet.getRow(i).getCell(j).toString();
				System.out.print(data+" ");
			}
			System.out.println();
		}
	}
}
