package tests.junit.Assignments;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;
import tests.testng.Tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AssignExecl extends Tests {

    @Test
    public void ExeclTest() throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\Areej\\IdeaProjects\\testProject\\resources\\TaskExel.xlsx");
        Workbook workbook = WorkbookFactory.create(file);
        Sheet List = workbook.getSheet("List");

        Row firstRow = List.getRow(0);
        Row row1 = List.getRow(1);
        Row row2 = List.getRow(2);
        Row row3 = List.getRow(3);
        Row row4 = List.getRow(4);
        Row row5 = List.getRow(5);

        firstRow.createCell(2).setCellValue("Population");
        row1.createCell(2).setCellValue("2000");
        row2.createCell(2).setCellValue("3000");
        row3.createCell(2).setCellValue("4000");
        row4.createCell(2).setCellValue("6000");
        row5.createCell(2).setCellValue("8000");

        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Areej\\IdeaProjects\\testProject\\resources\\TaskExel.xlsx");
        workbook.write(fileOutputStream);

        file.close();
        fileOutputStream.close();
        workbook.close();
    }
}