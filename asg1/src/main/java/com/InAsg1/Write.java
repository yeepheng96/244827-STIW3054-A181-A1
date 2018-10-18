package com.InAsg1;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.NullPointerException;
import static com.InAsg1.Read.findAll;

public class Write {
    public static void save() throws IOException {
        System.out.println("Writing excel file...");
        // Determine File Location
        File File_Name = new File("C:\\Users\\MyAsus\\Desktop\\Asg1\\Asg1.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Malaysia");

        try {
            // Parse Data into Excel File
            int r = 0;
            for (Info data : findAll()) {
                Row row = sheet.createRow(r++);
                Cell col1 = row.createCell(0);
                col1.setCellValue(data.getTd());
                Cell col2 = row.createCell(1);
                col2.setCellValue(data.getTh());
            }
            // Adjust Size of Cells
            for (int i = 0; i < 24; i++) {
                sheet.autoSizeColumn(i);
            }
            // Create Excel File
            FileOutputStream output = new FileOutputStream(File_Name);
            workbook.write(output);
            output.close();
            System.out.println("Your excel file was created successfully!");
            System.out.println("Location: "+File_Name);
        } catch (FileNotFoundException | NullPointerException e) {
            e.printStackTrace();
        }
    }
}
