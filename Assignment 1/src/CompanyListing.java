// Unit 1 Assignment: Competitive analysis - Jade Park (8-22-2021)

import java.util.Scanner;
public class CompanyListing { // driver class

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Welcome to Starr! How many companies would you like to enter? ");
		int selection = input.nextInt();
		
      // creating an array holding the companies the user inputs
		Company[] myCompanies = new Company[selection];
		
      // loop that creates as many objects as the user wants
		for (int i = 0; i < selection; i++) {
         
			System.out.print("\nCompany name: ");
         String name = input.next();
         
			System.out.print("Industry: ");
			String industry = input.next();
			
			System.out.print("Type (public or private): ");
			String type = input.next();
         
			System.out.print("CEO: ");
			input.nextLine();
         String ceo = input.nextLine();
         
			System.out.print("Has the No Ads feature: ");
			String hasFeature1 = input.next();
         
			System.out.print("Has the Profile Customization feature: ");
			String hasFeature2 = input.next();
         
			System.out.print("Has the Annual Membership feature: ");
			String hasFeature3 = input.next();
			
         // creates an object in the array declared earlier
			myCompanies[i] = new Company(name, industry, type, ceo, hasFeature1, hasFeature2, hasFeature3);
		}
      
      
      System.out.println("\nCompany Review:");
      
		for (int i = 0; i < selection; i++) {
			// calls the toString method
         System.out.println(myCompanies[i]);
		}
	}

}
