/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SecondLookAtClassesAndObjects;
import java.text.DecimalFormat;
/**
 *
 * @author LAB Student
 */
public class RetailItem {
    private String description;
    private int itemNumber;
    private CostData cost;
    
    public RetailItem(String desc, int itemNum, double wholesale, double retail){
        description = desc;
        itemNumber = itemNum;
        cost = new CostData();
        cost.setWholesale(wholesale);
        cost.setRetail(retail);
    }
    public RetailItem(RetailItem item){
        this.description = item.description;
        this.itemNumber = item.itemNumber;
        this.cost = item.cost;
    }
    public String toString(){
        String str;
        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        str = "Description: " + description 
            + "\nItem Number; " + itemNumber
            + "\nWholesale Cost: $" + dollar.format(cost.getWholesale())
            + "\nRetail Price: $" + dollar.format(cost.getRetail());
        return str;
    }
    public double getRetail(){
        return cost.retail;
    }
    private class CostData{
        public double wholesale;
        public double retail;
        public CostData(){
            wholesale = 0;
            retail = 0;
        }
    
        public CostData(double w, double r){
            wholesale = w;
            retail = r;
        }  
        public void setWholesale(double w){
            wholesale = w;
        }       
        public void setRetail(double r){
            retail = r;
        }
        public double getWholesale(){
            return wholesale;
        }
        public double getRetail(){
            return retail;
        }
    }
}
