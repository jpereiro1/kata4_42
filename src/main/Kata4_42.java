package main;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;

public class Kata4_42 {

    public static void main(String[] args) throws FileNotFoundException {


        String fileName = "C:\\Users\\Entrar\\Desktop\\Kata4_42\\Kata4_42\\email.txt";
        
        ArrayList<Mail> mailList = MailListReader.read(fileName);

        
        
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        
        
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        
        
        
        
                
        
        histoDisplay.execute();
    }
    
}
