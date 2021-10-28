package view;

import java.util.ArrayList;
import model.Histogram;
import model.Mail;


public class MailHistogramBuilder {
    
    public static Histogram<String> build(ArrayList<Mail> mailList){
        Histogram hist = new Histogram();
        
        while(){
            hist.increment(mailList.get(i).getDomain());
        }
        return hist;
    }
    
    
}
