/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalWorkshop;

/**
 *represents the class person with their variables, potting , method set and get corresponding.
 * @author David Alexander Romero Ipuz
 */
public class shirt {
    /**
     * variable Label with his type of datum(String)
     * identifier of a storage in specific (Label) in the memory
     */
    public String Label;
    /**
     * variable Size with his type of datum(String)
     * identifier of a storage in specific (Size) in the memory
     */
    protected String Size;
    /**
     * variable Colour with his type of datum(String)
     * identifier of a storage in specific (Colour) in the memory
     */
    public String Colour;
    /**
     * variable Price with his type of datum(double)
     * identifier of a storage in specific (Price) in the memory
     */
    private double Price;
   /**
    *Method set of the atribute Label
    *Her work is give an value at atribute(Label)
    * @param Label 
    */
    public void setLabel(String Label){
        this.Label=Label;
    }
     /**
     * Method get of the abribute Label
     * Return of the  values in  String type
     * @return 
     */
    public String getLabel(){return Label;}
  /**
   * Method set of the atribute Size
    *Her work is give an value at atribute(Size)
   * @param size 
   */
    protected void setSize(String Size){
        this.Size=Size;
    }
    /**
     * Method get of the abribute Size
     * Return of the  values in  String type
     * @return 
     */
    protected String getSize(){return Size;}
     /**
     * Method set of the atribute Colour
     *Her work is give an value at atribute(Colour)
     * @param Colour 
     */
    public void  setColour(String Colour){
        this.Colour=Colour;
    }
    /**
     * Method get of the abribute Colour
     * Return of the  values in  String type
     * @return 
     */
    public String getColour(){return Colour;}
    /**
     *Method set of the atribute Price
     *Her work is give an value at atribute(Price)
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
}

