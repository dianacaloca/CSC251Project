import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Project1_Diana_Caloca
{
   public static void main(String[] args) throws IOException
   {
     Scanner keyboard = new Scanner(System.in);
     int num, holderAge;
     double holderHeight, holderWeight;
     String provider, first, last, status;
     
      File policyFile = new File("PolicyInformation.txt");
      
      if(!policyFile.exists()){
         System.out.println("Unable to open file");
         System.exit(0);
      }
      
      Scanner inputFile = new Scanner(policyFile);
      
      ArrayList<Policy> policyList = new ArrayList<Policy>(); //policyList references an ArrayList of Policy objects
      
      while(inputFile.hasNext())
      {  
         num = inputFile.nextInt();
         inputFile.nextLine();
         provider = inputFile.nextLine();
         first = inputFile.nextLine();
         last = inputFile.nextLine();
         holderAge = inputFile.nextInt();
         inputFile.nextLine();
         status = inputFile.nextLine();

         holderHeight = inputFile.nextInt();
         holderWeight = inputFile.nextInt();
         
         if(inputFile.hasNext())
         { 
            inputFile.nextLine();
         }
         Policy policyEntry = new Policy(num, provider, first, last, holderAge, status, holderHeight, holderWeight);
         policyList.add(policyEntry); // add Policy objects to ArrayList
      }
      
      inputFile.close();
      
         for(int i = 0; i < policyList.size(); i++)
         {
            System.out.println();
            System.out.println("Policy Number: " + policyList.get(i).getPolicyNum());
            System.out.println("Provider Name: " + policyList.get(i).getProviderName());
            System.out.println("Policyholder's First Name: " + policyList.get(i).getHolderFirstName());
            System.out.println("Policyholder's Last Name: " + policyList.get(i).getHolderLastName());
            System.out.println("Policyholder's Age: " + policyList.get(i).getPolicyholderAge());
            System.out.println("Policyholder's Smoking Status: " + policyList.get(i).getSmokingStatus());
            System.out.println("Policyholder's Height: " + policyList.get(i).getPolicyholderHeight() + " inches");
            System.out.printf("Policyholder's Weight: %.2f pounds ", policyList.get(i).getPolicyholderWeight());
            System.out.printf("\nPolicyholder's BMI: %.2f ", policyList.get(i).getHolderBMI());
            System.out.printf("\nPolicy Price: $%,.2f ", policyList.get(i).getInsurancePrice());
         }
         
   }
}