public class Company { // models your company and its competitors
	
   // attributes
	private String companyName;
	private String industry;
	private String type;
	private String CEO_Name;
	private String hasNoAds;
	private String hasCustomization;
	private String hasMembership;
	
	// default constructor
	public Company() {
		companyName = "";
		industry = "";
		type = "";
		CEO_Name = "";
		hasNoAds = "";
		hasCustomization = "";
		hasMembership = "";
	}
	
	// parameterized constructor
	public Company(String name, String industry, String type, String ceo, String hasNoAds, String hasCustomization, String hasMembership) {
		companyName = name;
		this.industry = industry;
		this.type = type;
		CEO_Name = ceo;
		this.hasNoAds = hasNoAds;
		this.hasCustomization = hasCustomization;
		this.hasMembership = hasMembership;
	}
	
	
	// getter and setter methods for each attribute
	public String getCompanyName() {
		return companyName;
	}
   
	public void setCompanyName(String name) {
		companyName = name;
	}
	
	public String getIndustry() {
		return industry;
	}
   
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	
	public String getType() {
		return type;
	}
   
	public void setType(String type) {
		this.type = type;
	}
   
	public String getCEOName() {
		return CEO_Name;
	}
   
	public void setCEOName(String name) {
		CEO_Name = name;
	}
	
	public String getHasNoAds() {
		return hasNoAds;
	}
   
	public void setHasNoAds(String hasNoAds) {
		this.hasNoAds = hasNoAds;
	}
	
	public String getHasCustomization() {
		return hasCustomization;
	}
   
	public void setHasCustomization(String hasCustomization) {
		this.hasCustomization = hasCustomization;
	}
	
	public String setHasMembership() {
		return hasMembership;
	}
   
	public void getHasMembership(String hasMembership) {
		this.hasMembership = hasMembership;
	}
	
	
	// toString method
	public String toString() {  
		
      String str = "";
      str += companyName + ", CEO ";
	   str += CEO_Name + ", ";
      str += type + " company. Company ";
	   
      if (hasNoAds.equals("yes")) {
	      str += "sells the No Ads feature";
	   } else {
	      str += "does not sell the No Ads feature";
	   }
	      
	   if (hasCustomization.equals("yes")) {
    	   str += " and sells the Profile Customization feature ";
      } else {
    	   str += " and does not sell the Profile Customization feature ";
    	}
    	  
    	if (hasMembership.equals("yes")) {
   	   str += "and sells the Annual Membership feature.";
    	} else {
         str += "and does not sell the Annual Membership feature.";
    	}

	   return str;
	}
}














