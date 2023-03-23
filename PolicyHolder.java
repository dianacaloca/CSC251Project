public class PolicyHolder
{
   private String firstName;
   private String lastName;
   private int age;
   private String smokeStatus;
   private double height;
   private double weight;

   public PolicyHolder()
   {
      firstName = "No name";
      lastName = "No name";
      age = -1;
      smokeStatus = "N/A";
      height = 0.0;
      weight = 0.0;
   }
   
   /**
      Contructor for PolicyHolder Class
   @param firstName the Policyholder's first name
   @param lastName the policyholder's last name.
   @param age The policyholder's age
   @param smokeStatus The smoking status of the policyholder (smoker/non-smoker).
   @param height The height of the policyholder in pounds.
   @param weight The weight of the policyholder in inches.
   */
   public PolicyHolder(String firstName, String lastName, int age, String smokeStatus, double height, double weight)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.smokeStatus = smokeStatus;
      this.height = height;
      this.weight = weight;
   }
   
   /** Setter method to set the Policyholder's first name 
   @param firstName The policyholder's first name. */
   public void setHolderFirstName(String firstName){
      this.firstName = firstName;
   }
   
   /**Setter method to set the policyholder's last name
   @param lastName The policyholder's last name. */ 
   public void setHolderLastName(String lastName){
      this.lastName = lastName;
   }
   
   /** Setter method to set the policyholder's age
   @param age The policyholder's age. */
   public void setHolderAge(int age){
      this.age = age;
   }
   
   /** Setter method to set the smoking status
   @param smokeStatus The policyholder's smkoing status. */
   public void setSmokingStatus(String smokeStatus){
      this.smokeStatus = smokeStatus;
   }
   
   /** Setter method to set the policyholder's height
   @param height The policyholder's height in inches.*/
   public void setHolderHeight(double height){
      this.height = height;
   }
   /** Setter method to set the policyholder's weight
   @param weight The policyholder's weight in pounds. */
   public void setHolderWeight(double weight){
      this.weight = weight;
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
   public int getHolderAge(){
      return age;
   }
   
   /** getSmokingStatus method returns the smoking status
   @return The policyholder's smoking status. */
   public String getSmokingStatus(){
      return smokeStatus;
   }
   
   /** getPolicyholderHeight method returns the height
   @return The height of the policyholder in inches. */
   public double getHolderHeight(){
      return height;
   }
   
   /** getPolicyholderWeight method returns the weight
   @return The policyholder's weight in pounds */
   public double getHolderWeight(){
      return weight;
   }

    /** getHolderBMI method returns the BMI
   @return The BMI of the policyholder based on their height and weight. */
   public double getHolderBMI()
   {
      final double CONVFACTOR = 703;
      return (weight * CONVFACTOR) / (Math.pow(height, 2.0));
   }

}