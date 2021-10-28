package view;

import java.util.ArrayList;
import model.Histogram;
import model.Mail;


public class MailHistogramBuilder {
    
    public static Histogram<String> build(ArrayList<Mail> mailList){
        Histogram hist = new Histogram();
        
        for (int i = 0; i < mailList.size(); i++) {
            hist.increment(mailList.get(i).getDomain());
        }
        return hist;
    }
    
    
}
