/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalWorkshop;

   /**
   *represents the class AccountBank with their variables, potting , method set and get corresponding.
   *@author David Alexander Romero Ipuz
   */
    public class accountBank {
     /**
     * variable NumberCd with his type of datum(String)}
     * identifier of a storage in specific (NumberCd) in the memory
     */
    public String NumberCd;
     /**
     * variable AccountNumber with his type of datum(int)
     * identifier of a storage in specific (AccountNumber) in the memory
     */
    protected int AccountNumber;
     /**
     * variable NumberCd with his type of datum(boolean)
     * identifier of a storage in specific (Acrivate) in the memory
     */
    private boolean Activate;
    /**
    *Method set of the atribute Number
    *Her work is give an value at atribute(Number)
     * @param NumberCd 
     */
    public void setNumerCd(String numberCd){
        this.NumberCd=numberCd;
    }
      /**
     * Method get of the abribute NumberCd
     * Return of the  values in  String type
     * @return 
     */
    public String getNumberCd(){return NumberCd;}
   /**
    *Method set of the atribute AccountNumber
    *Her work is give an value at atribute(AccountNumber)
    * @param AccountNumber 
    */
    protected void setAccountNumber(int AccountNumber){
        this.AccountNumber=AccountNumber;
    }
     /**
     * Method get of the abribute AccountNumber
     * Return of the  values in  int type
     * @return 
     */
    protected int getAccountNumber(){return AccountNumber;}
    /**
    *Method set of the atribute Acctivate
    *Her work is give an value at atribute(boolean)
    * @param Acctivate 
    */
    private void setActivate(boolean activate){
        this.Activate=Activate;
    }
      /**
     * Method get of the abribute Activate
     * Return of the  values in  boolean type
     * @return 
     */
    private boolean getActivate(){return Activate;}

}


