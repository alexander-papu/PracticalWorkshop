/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalWorkshop;

import java.util.ArrayList;

/**
 *represents the class fuit with their variables, potting , method set and get corresponding.
 * @author David Alexander Romero Ipuz
 */
public class fruit {
     /**
     * variable Name with his type of datum(String)}
     * identifier of a storage in specific (Name) in the memory
     */
    public String Name;
     /**
     * variable Price with his type of datum(Double)
     * identifier of a storage in specific (Price) in the memory
     */
    private double Price;
     /**
     * variable AverageWeigth with his type of datum(float)
     * identifier of a storage in specific (AvergaeWeigth) in the memory
     */
    protected float AverageWeigth;
     /**
     * variable AverageWeigth with his type of datum(String)
     * identifier of a storage in specific (Colors) in the memory
     */
    public String[] Colors;   
    /**
     * Method set of the atribute name
     * Her work is give an value at atribute(name)
     * @param Name 
     */
    public void setName(String Name){
        this.Name=Name;
    }
    /**
     * Method get of the abribute name
     * Return of the  values in  String type
     * @return 
     */
    public String getName(){return Name;}
    /**
     * Method set of the atribute name
     * Her work is give an value at atribute(price)
     * @param Price 
     */
    private void setPrice(double Price){
        this.Price=Price;
    }
    /**
     * Method get of the abribute Price
     * Return of the  values in  double type
     * @return 
     */
    private double getPrice(){return Price;}
    /**
     * Method set of the atribute AverageWeigth
     * Her work is give an value at atribute(AverageWeigth)
     * @param AverageWeigth 
     */
    protected void setAverageWeigth(float AverageWeigth){
        this.AverageWeigth = AverageWeigth;
    }
    /**
     * Method get of the abribute AverageWeigth
     * Return of the  values in  float type
     * @return 
     */
    protected float getAverageWeigth(){return AverageWeigth;}
    /**
     *Method set of the atribute Colors
     * Her work is give an value at atribute(Colors)
     * @param colors 
     */
    public void setColors(String[] Colors){
        this.Colors=Colors;
    }
      /**
     * Method get of the abribute Colors
     * Return of the  values in  String[] type
     * @return 
     */
    public String[] getColors(){return Colors;}
    
}

