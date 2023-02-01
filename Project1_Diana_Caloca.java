import java.util.Scanner;

public class Project1_Diana_Caloca
{
   public static void main(String[] args)
   {
     Scanner keyboard = new Scanner(System.in);
     int num, holderAge;
     double holderHeight, holderWeight;
     String provider, first, last, status;
     
     System.out.println("Please enter the Policy Number: ");
      num = keyboard.nextInt();
      keyboard.nextLine();
     System.out.println("Please enter the Provider's Name: ");
      provider = keyboard.nextLine();
     System.out.println("Please enter the Policyholder's First Name: ");
      first = keyboard.nextLine();
     System.out.println("Please enter the Policyholder's Last Name: ");
      last = keyboard.nextLine();
     System.out.println("Please enter Policyholder's Age: ");
      holderAge = keyboard.nextInt();
      keyboard.nextLine();
     System.out.println("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      status = keyboard.nextLine();
     System.out.println("Please enter the Policyholder's Height (in inches): ");
      holderHeight = keyboard.nextDouble();
     System.out.println("Please enter the Policyholder's Weight (in pounds): ");
      holderWeight = keyboard.nextDouble();
      
      Policy policyholder1 = new Policy(num, provider, first, last, holderAge, status, holderHeight, holderWeight);
      
      System.out.println("Policy Number: " + policyholder1.getPolicyNum());
      System.out.println("Provider Name: " + policyholder1.getProviderName());
      System.out.println("Policyholder's First Name: " + policyholder1.getHolderFirstName());
      System.out.println("Policyholder's Last Name: " + policyholder1.getHolderLastName());
      System.out.println("Policyholder's Age: " + policyholder1.getPolicyholderAge());
      System.out.println("Policyholder's Smoking Status: " + policyholder1.getSmokingStatus());
      System.out.println("Policyholder's Height: " + policyholder1.getPolicyholderHeight() + " inches");
      System.out.printf("Policyholder's Weight: %.2f pounds ", policyholder1.getPolicyholderWeight());
      System.out.printf("\nPolicyholder's BMI: %.2f ", policyholder1.getHolderBMI());
      System.out.printf("\nPolicy Price: $%,.2f ", policyholder1.getInsurancePrice());
   }
}