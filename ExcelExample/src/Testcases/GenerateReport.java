package Testcases;
import java.io.IOException;


import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.common.excelreport.ExcelReportGenerator;

public class GenerateReport {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        // TODO Auto-generated method stub
        
        ExcelReportGenerator.generateExcelReport("MyProject.xls", "/home/terli001gmail/eclipse-workspace/ExcelExample/");
    }
}
