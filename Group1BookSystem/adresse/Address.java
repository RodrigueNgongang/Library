// June 1st. 2019
//@Author Rodrigue.

package adresse;

public class Address{
    
    public int streetNum;
    public String city;
    public String country;
    
   public Address(int street, String c, String coun){
       this.streetNum=street;
       this.city =c;
       this.country = coun;
       }
   public int getStreetNum(){
      return streetNum;
      }
    
   public String getCity(){
      return city;
      }
    
   public String getCountry(){
      return country;
      }
    
   public void setStreetNum(int streetNum){
      this.streetNum=streetNum;
      }
    
   public void setCity(String city){
      this.city=city;
      }
   
   public void setCountry(String country){
      this.country=country;
      }
}
