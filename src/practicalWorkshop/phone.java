/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalWorkshop;

/**
 *represents the class person with their variables, potting , method set and get corresponding.
 * @author david Alexander Romero Ipuz
 */
public class phone {
     /**
     * variable Name with his type of datum(String)
     * identifier of a storage in specific (Name) in the memory
     */
    public String Name;
     /**
     * variable NumberReference with his type of datum(String)
     * identifier of a storage in specific (NumberReference) in the memory
     */
    protected String NumberReference;
     /**
     * variable MemoryRam with his type of datum(double)
     * identifier of a storage in specific (MemoryRam) in the memory
     */
    private double MemoryRam;
     /**
     * variable MemoryRom with his type of datum(Double)
     * identifier of a storage in specific (MemoryRom) in the memory
     */
    private double MemoryRom;
     /**
     * variable Cmara with his type of datum(String)
     * identifier of a storage in specific (Camara) in the memory
     */
    private String Camara;
     /**
     * variable RefNucleos with his type of datum(String)}
     * identifier of a storage in specific (RefNucleos) in the memory
     */
    private String RefNucleos;
    /**
    * Method set of the atribute name
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
 *Method set of the atribute NumberReference
 *Her work is give an value at atribute(NumberReference)
 * @param NumberReference 
 */
protected void setNumberReference(String  NumberReference){
    this.NumberReference=NumberReference;
}
     /**
     * Method get of the abribute NumberReference
     * Return of the  values in  String type
     * @return 
     */
protected String getNumberReference(){return NumberReference;}        
/**
 *Method set of the atribute MemoryRam
 *Her work is give an value at atribute(MemroryRam)
 * @param MemoryRam 
 */
private void setMemoryRam(double MemoryRam){
    this.MemoryRam=MemoryRam;
}
/**
     * Method get of the abribute MemoryRam
     * Return of the  values in  double type
     * @return 
     */
private double getMemoryRam(){return MemoryRam;}
/**
 *Method set of the atribute MemoryRom
 *Her work is give an value at atribute(MemroryRom)
 * @param memoryRom 
 */
private void setMemoryRom(double memoryRom){
    this.MemoryRom=MemoryRom;
}
/**
 * Method get of the abribute MemoryRom
 * Return of the  values in  double type
 * @return 
   */
private double getMemoryRom(){return MemoryRom;}
/**
 *Method set of the atribute Camara
 *Her work is give an value at atribute(Camara)
 * @param Camara 
 */
private void setCamara(String Camara){
    this.Camara=Camara;
}
/**
 * Method get of the abribute Camara
 * Return of the  values in  String type
 * @return 
   */
private String getCamara(){return Camara;}
/**
 *Method set of the atribute Camara
 *Her work is give an value at atribute(RefNucleos)
 * @param RefNucleos 
 */
private void setRefNucleos( String RefNucleos){
    this.RefNucleos=RefNucleos;
}
/**
 * Method get of the abribute RefNucleos
 * Return of the  values in  String type
 * @return 
   */
private  String getReferenciaNucleos(){return RefNucleos;}
}



