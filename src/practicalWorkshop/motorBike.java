/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalWorkshop;

/**
 *represents the class motorBike with their variables, potting , method set and get corresponding.
 * @author david
 */
public class motorBike {
     /**
     * variable Name with his type of datum(String)}
     * identifier of a storage in specific (Name) in the memory
     */
    public String Name;
     /**
     * variable Label with his type of datum(String)}
     * identifier of a storage in specific (Label) in the memory
     */
    protected String Label;
     /**
     * variable Name with his type of datum(String)}
     * identifier of a storage in specific (Torque) in the memory
     */
    public String Torque;
     /**
     * variable Name with his type of datum(double)}
     * identifier of a storage in specific (Weigth) in the memory
     */
    public double Weigth;
     /**
     * variable Name with his type of datum(double)
     * identifier of a storage in specific (Price) in the memory
     */
    private double Price;
    /**
     *Method set of the atribute name
     *Her work is give an value at atribute(Name)
     * @param Name 
     */
    public void setName(String Name){
        this.Name=Name;
    }
    /**
     * Method get of the abribute Name
     * Return of the  values in  String type
     * @return 
     */
    public String getName(){return Name;}
    /**
     *Method set of the atribute label
     *Her work is give an value at atribute(label)  
     * @param Label 
     */
    protected void setLabel(String Label){
        this.Label=Label;
    }
      /**
     * Method get of the abribute label
     * Return of the  values in  String type
     * @return 
     */
    protected String getLable(){return Label;}
    /**
     *Method set of the atribute label
     *Her work is give an value at atribute(Torque)  
     * @param Torque 
     */
    public void setTorque(String Torque){
        this.Torque=Torque;
    }
     /**
     * Method get of the abribute Torque
     * Return of the  values in  String type
     * @return 
     */
    public String getTorque(){return Torque;}
    /**
     *Method set of the atribute Weigth
     *Her work is give an value at atribute(Weigth)  
     * @param Weigth 
     */
    public void setWeigth(double Weigth){
        this.Weigth=Weigth;
    }
    /**
     * Method get of the abribute Weigth
     * Return of the  values in  double type
     * @return 
     */
    public double getWeigth(){return Weigth;}
    /**
     *Method set of the atribute Price
     *Her work is give an value at atribute(Price)
     * @param Price 
     */
    private void setPrice(double price){
        this.Price=price;
    }
     /**
     * Method get of the abribute Price
     * Return of the  values in  double type
     * @return 
     */
    private double getPrice(){return Price;}
}

