package Receiver1;

import org.jfree.chart.*;
import org.jfree.data.category.*;
import org.jfree.chart.plot.*;
import java.awt.*;
import java.sql.*;
public class Chart1 {

    public static void main(String arg[]){
        try{
            
 DefaultCategoryDataset dataset = new DefaultCategoryDataset();
 
    // String energy=rs.getString(2);
     dataset.setValue(Evaluation.tit*5,"","ExistingSystem");
// }
//
    dataset.setValue(Evaluation.tit,"","ProposedSystem");
  //  dataset.setValue(representative.count+2,"Existing","MI based Supervised Clustering");
  JFreeChart chart = ChartFactory.createBarChart
  ("","System Performance", "Time Efficiency", dataset,
   PlotOrientation.VERTICAL, false,true, false);
  chart.setBackgroundPaint(Color.white);
  chart.getTitle().setPaint(Color.blue);
  CategoryPlot p = chart.getCategoryPlot();
  p.setRangeGridlinePaint(Color.BLACK);
  ChartFrame frame1=new ChartFrame("Bar Chart",chart);
  frame1.setVisible(true);
  frame1.setSize(400,400);
    }
        catch(Exception e){
     System.out.println(e.getMessage());
        }
    }
}