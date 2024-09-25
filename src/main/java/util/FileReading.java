package util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class FileReading {
    public static Properties readFile(String filename){
        Properties p = new Properties();
        try {
            File f = new File("D:\\Selenium_TestNg_Learning\\src\\test\\resources\\testdata\\" + filename);
            FileInputStream fileInputStream = new FileInputStream(f);

            p.load(fileInputStream);
        }catch(Exception e){
            System.out.println("Issue while reading the file " + e);
        }
        return p;
    }
}
