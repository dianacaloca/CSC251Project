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
   
   /** No- arg Constructor for Policy class */
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
   /** Constructor for Policy class 
   @param num The policy number.
   @param provider The provider's name.
   @param first The policyholder's first name.
   @param last the policyholder's last name.
   @param holderAge The policyholder's age
   @param status The smoking status of the policyholder (smoker/non-smoker).
   @param holderHeight The height of the policyholder in pounds.
   @param holderWeight The weight of the policyholder in inches.
   */
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
   
   /** Setter method to set the policy number
   @param num The policy number. */
   public void setPolicyNum(int num){
      policyNumber = num;
   }
   
   /** Setter method to set the provider's name 
   @param provider The provider's name. */
   public void setProviderName(String provider){
      providerName = provider;
   }
   /** Setter method to set the Policyholder's first name 
   @param first The policyholder's first name. */
   public void setHolderFirstName(String first){
      firstName = first;
   }
   
   /**Setter method to set the policyholder's last name
   @param last The policyholder's last name. */ 
   public void setHolderLastName(String last){
      lastName = last;
   }
   
   /** Setter method to set the policyholder's age
   @param holderAge The policyholder's age. */
   public void setPolicyholderAge(int holderAge){
      age = holderAge;
   }
   
   /** Setter method to set the smoking status
   @param status The policyholder's smkoing status. */
   public void setSmokingStatus(String status){
      smokeStatus = status;
   }
   
   /** Setter method to set the policyholder's height
   @param holderHeight The policyholder's height in inches.*/
   public void setPolicyholderHeight(double holderHeight){
      height = holderHeight;
   }
   /** Setter method to set the policyholder's weight
   @param holderWeight The policyholder's weight in pounds. */
   public void setPolicyholderWeight(double holderWeight){
      weight = holderWeight;
   }
   
   /** getpolicyNum method returns the policy number
   @return The policy number. */
   public int getPolicyNum(){
      return policyNumber;
   }
   
   /** getProviderName method returns the provider's name 
   @return The provider's name. */
   public String getProviderName(){
      return providerName;
   }
   
   /** getHolderFirstName method returns the first name
   @return The policyholder's first name.*/
   public String getHolderFirstName(){
      return firstName;
   }
   
   /**getHolderLastName method returns the last name 
   @return The policyholder's last name.*/
   public String getHolderLastName(){
      return lastName;
   }
   
   /** getPolicyholderAge method returns the age
   @return The policyholder's age. */
   public int getPolicyholderAge(){
      return age;
   }
   
   /** getSmokingStatus method returns the smoking status
   @return The policyholder's smoking status. */
   public String getSmokingStatus(){
      return smokeStatus;
   }
   
   /** getPolicyholderHeight method returns the height
   @return The height of the policyholder in inches. */
   public double getPolicyholderHeight(){
      return height;
   }
   
   /** getPolicyholderWeight method returns the weight
   @return The policyholder's weight in pounds */
   public double getPolicyholderWeight(){
      return weight;
   }
   
   /** getHolderBMI method returns the BMI
   @return The BMI of the policyholder based on their height and weight. */
   public double getHolderBMI()
   {
      final double CONVFACTOR = 703;
      return (weight * CONVFACTOR) / (Math.pow(height, 2.0));
   }
   
   /** getInsurancePrice method returns the total insurance price
   @return The price of the insurance based on smoking status, BMI, & age plus a base fee. */
   public double getInsurancePrice()
   {
      final double BASE_FEE = 600.0;
      final double ADD_FEE_SMOKING = 100.0;
      final double ADD_FEE_PER_BMI = 20.0;
      final double ADD_FEE_AGE = 75.0;
      double price = BASE_FEE;
      final int AGE_THRESHOLD = 50;
      final int BMI_THRESHOLD = 35;
      
      if (age > AGE_THRESHOLD)
      {
         price += ADD_FEE_AGE;     
      }
      
      if (smokeStatus.equalsIgnoreCase("smoker"))
      {
         price += ADD_FEE_SMOKING;
      }
         
      if (getHolderBMI() > BMI_THRESHOLD)
      {
         price += ((getHolderBMI() - BMI_THRESHOLD) * ADD_FEE_PER_BMI);   
      }
 
         return price;
   }
}