package thbs.SringJDBCTrainProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
          ApplicationContext context = new ClassPathXmlApplicationContext("file:src/test/java/thbs/SringJDBCTrainProject/beans.xml");
        
        
        
        
        TrainDAO1 b1 = (TrainDAO1) context.getBean("TrainDAO");
        
        System.out.println(b1.selectAll());
        
        
//        Train b2 = new Train();
//        
//       
//        b2.setTrain_no(1234);
//        b2.setTrain_name("hampi express");
//        b2.setSource_name("hubli");
//        b2.setdestination("mysore");
//        b2.setTicket_price(500);
//        
//        b1.insert(b2);
        
        
        //System.out.println(b1.select(1001));
        ((AbstractApplicationContext)context).close();
        
        
        
        

    }
    	
    }

