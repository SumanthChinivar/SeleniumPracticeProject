package readingDataFromFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadSingleDataFromPropertyFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file = new File("./TestData/SingleData.xlsx");
		FileInputStream fis = new FileInputStream(file);

		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Practice");

		String data = sheet.getRow(0).getCell(0).toString();
		System.out.println(data);
	}
}
