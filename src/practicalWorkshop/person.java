/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalWorkshop;

import java.util.Date;

/**
 *represents the class person with their variables, potting , method set and get corresponding.
 * @author David Alexander Romero Ipuz
 */
public class person {
    /**
     * variable Name with his type of datum(String)}
     * identifier of a storage in specific (Name) in the memory
     */
    public String Name;
    /**
     * variable LatsName1 with his type of datum(String)
     * identifier of a storage in specific (LastName1) in the memory
     */
    protected String LastName1;
    /**
     * variable LatsName2 with his type of datum(String)
     * identifier of a storage in specific (LastName2) in the memory
     */
    protected String LastName2;
    /**
     * variable Name with his type of datum(String)
     * identifier of a storage in specific (NumberCd) in the memory
     */
    private String NumberCd;
    /**
     * variable DateBirth with his type of datum(Date)
     * identifier of a storage in specific (DateBirth) in the memory
     */
    private Date DateBirth;
    /**
     * variable Height with his type of datum(float)
     * identifier of a storage in specific (Heigth) in the memory
     */
    private float Height;
    /**
     * variable Weigth with his type of datum(float)
     * identifier of a storage in specific (Weigth) in the memory
     */
    private float Weigth;
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
     *Method set of the atribute name
     *Her work is give an value at atribute(LastName1)
     * @param lastName1 
     */
    protected void setLastName1(String lastName1){
        this.LastName1=lastName1;
    }
    /**
     * Method get of the abribute LastName1
     * Return of the  values in  String type
     * @return 
     */
    protected String getLastName1(){return LastName1;}
    /**
     *Method set of the atribute name
     *Her work is give an value at atribute(LastName2)
     * @param lastName2 
     */
    protected void setLastName2(String lastName2){
        this.LastName2=lastName2;
    }
    /**
     * Method get of the abribute LastName2
     * Return of the  values in  String type
     * @return 
     */
    protected String getLastName2(){return LastName2;}
    /**
     *Method set of the atribute name
     *Her work is give an value at atribute(NumberCd)
     * @param NumberCd 
     */
    private void setNumberCd(String NumberCd){
        this.NumberCd=NumberCd;
    }
    /**
     * Method get of the abribute NumberCd
     * Return of the  values in  String type
     * @return 
     */
    private String getNumberCd(){return NumberCd;}
    /**
     *Method set of the atribute name
     *Her work is give an value at atribute(DateBirth)
     * @param DateBirth 
     */
    private void  setDateBirth(Date dateBirth ){
        this.DateBirth=DateBirth;
    }
    /**
     * Method get of the abribute DateBird
     * Return of the  values in  date type
     * @return 
     */
    private Date getDateBirth(){return DateBirth;}
    /**
     * Method set of the atribute name
     *Her work is give an value at atribute(Height)
     * @param Height 
     */
    private void setHeight(float Height){
        this.Height=Height;
    }
     /**
     * Method get of the abribute Height
     * Return of the  values in  float type
     * @return 
     */
    private float getHeight(){return Height;}
    /**
     *Method set of the atribute name
     *Her work is give an value at atribute(Weight)
     * @param weight 
     */
    private void setWeigth(float Weight){
        this.Weigth=Weigth;
    }
    /**
     * Method get of the abribute Weigth
     * Return of the  values in  float type
     * @return 
     */
    private float getWeigth(){return Weigth;}
}

