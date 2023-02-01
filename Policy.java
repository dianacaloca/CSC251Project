public class Policy
{
   private int policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokeStatus;
   private double height;
   private double weight;
   
   public Policy()
   {
      policyNumber = -1;
      providerName = "NoName";
      firstName = "No name";
      lastName = "No name";
      age = -1;
      smokeStatus = "N/A";
      height = 0.0;
      weight = 0.0;   
   }
   
   public Policy(int num, String provider, String first, String last, int holderAge, String status, double holderHeight, double holderWeight)
   {
      policyNumber = num;
      providerName = provider;
      firstName = first;
      lastName = last;
      age = holderAge;
      smokeStatus = status;
      height = holderHeight;
      weight = holderWeight;
   }
   
   public void setPolicyNum(int num){
      policyNumber = num;
   }
   
   public void setProviderName(String provider){
      providerName = provider;
   }
   
   public void setHolderFirstName(String first){
      firstName = first;
   }
   
   public void setHolderLastName(String last){
      lastName = last;
   }
   
   public void setPolicyholderAge(int holderAge){
      age = holderAge;
   }
   
   public void setSmokingStatus(String status){
      smokeStatus = status;
   }
   
   public void setPolicyholderHeight(double holderHeight){
      height = holderHeight;
   }
   
   public void setPolicyholderWeight(double holderWeight){
      weight = holderWeight;
   }
   
   public int getPolicyNum(){
      return policyNumber;
   }
   
   public String getProviderName(){
      return providerName;
   }
   
   public String getHolderFirstName(){
      return firstName;
   }
   
   public String getHolderLastName(){
      return lastName;
   }
   
   public int getPolicyholderAge(){
      return age;
   }
   
   public String getSmokingStatus(){
      return smokeStatus;
   }
   
   public double getPolicyholderHeight(){
      return height;
   }
   
   public double getPolicyholderWeight(){
      return weight;
   }
   
   public double getHolderBMI()
   {
      return (weight * 703) / (Math.pow(height, 2.0));
   }
   
   public double getInsurancePrice()
   {
      final double BASE_FEE = 600.0;
      double addFee = 0.0;
      
      if (age > 50){
         addFee = 75.0;
         
      }
      if (smokeStatus.equalsIgnoreCase("smoker"))
      {
         addFee = 100.0;
         
      }
      if (getHolderBMI() > 35)
      {
         addFee = (getHolderBMI() - 35) * 20;
         
      }
      if (age > 50 && smokeStatus.equalsIgnoreCase("smoker") && getHolderBMI() > 35)
      {
         addFee = 75 + 100 + ((getHolderBMI() - 35) * 20);
        
      }
      if (age > 50 && smokeStatus.equalsIgnoreCase("smoker"))
      {
         addFee = 75 + 100;
         
      }
      if (age > 50 && getHolderBMI() > 35)
      {
         addFee = 75 + ((getHolderBMI() - 35) * 20);
         
      }
      if (getHolderBMI() > 35 && smokeStatus.equalsIgnoreCase("smoker"))
      {
         addFee = ((getHolderBMI() - 35) * 20) + 100;
         
      }
         return addFee;
   }
}