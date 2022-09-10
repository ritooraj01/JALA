import java.io.*;
import java.io.File;  
import java.io.FileInputStream;  
import java.io.IOException;  
import org.apache.poi.hssf.usermodel.HSSFSheet;  
import org.apache.poi.hssf.usermodel.HSSFWorkbook;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.FormulaEvaluator;  
import org.apache.poi.ss.usermodel.Row;  
import javax.annotation.processing.FilerException;
public class JavaIO {
    static void inputoutput(){
        try {
            FileInputStream fi = new FileInputStream("E:\\Inout.txt");
            FileOutputStream f = new FileOutputStream("E:\\Inout.txt");
            FileReader file = new FileReader("E:\\Inout.txt");
            int i = 0;
            while((i = fi.read())!=-1){
                System.out.print((char)i);
            }
            fi.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void filewrite(){
        try {
            FileWriter fie = new FileWriter("E:\\Inout.txt");
            fie.write("Hello this is Rituraj");
            fie.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public static void main(String[] args) throws IOException
    {
        FileInputStream fi = new FileInputStream("E:\\student.xlsx");

        HSSFWorkbook wb = new HSSFWorkbook(fi);

        HSSFSheet sheet = wb.getSheetAt(0);

        FormulaEvaluator formulaEvaluator = wb.getCreationHelper().createFormulaEvaluator();

        for(Row row: sheet){
            for(Cell cell: row){
                switch(formulaEvaluator.evaluateInCell(cell).getCellType())  
                {  
                    case Cell.CELL_TYPE_NUMERIC:   //field that represents numeric cell type  
//getting the value of the cell as a number  
                    System.out.print(cell.getNumericCellValue()+ "\t\t");   
                    break;  
                    case Cell.CELL_TYPE_STRING:    //field that represents string cell type  
                    //getting the value of the cell as a string  
                    System.out.print(cell.getStringCellValue()+ "\t\t");  
                    break;
                }
            }System.out.println();
        }
    }
}
