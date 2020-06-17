package CountryCity;

public class MainClass {
	   public static void main(String[] args) {
		    CityDAOClass cityDAO = new CityDAOClass();
		    CountryDAOClass countryDAO = new CountryDAOClass();
		   		  
	     //print all Cities
		 System.out.println("All Cities.");
	     for (City c : cityDAO.getAllCities()) {
	         System.out.println("City: [ Id : "+c.getCityId()+", Name : "+c.getName() 
	        		 + ", Is it a Capital? : "+c.getIsCapital() + " ]");
	      }  
	     
	     System.out.println("\n");
	     
	     //print all Countries 
	     System.out.println("All Countries");
	     for (Country cn : countryDAO.getAllCountries()) {
	         System.out.println("Country: [ Id : "+cn.getCountryId()+", Name : "+cn.getCountryName() 
	        		 + ", Population : "+cn.getPopulation() + " , CityId : " +cn.getCityId() + " ]");
	      }  
	     
	     System.out.println("\n"); 
	     
	     System.out.println("Cities and Countries with the same City id of 3.");
	     for (City c : cityDAO.getCityId()) {
	         System.out.println("City: [ Id : "+c.getCityId()+", Name : "+c.getName() 
	        		 + ", Is it a Capital? : "+c.getIsCapital() + " ]");
	      } 
	     for (Country cn : countryDAO.getCityId()) {
	         System.out.println("Country: [ Id : "+cn.getCountryId()+", Name : "+cn.getCountryName() 
	        		 + ", Population : "+cn.getPopulation() + " , CityId : " +cn.getCityId() + " ]");
	      }
	     
	     System.out.println("\n"); 
	     
	     System.out.println("Countries with Cities that are Capitals.");
	     for (City c : cityDAO.getCapital()) {
	         System.out.println("City: [ Id : "+c.getCityId()+", Name : "+c.getName() 
	        		 + ", Is it a Capital? : "+c.getIsCapital() + " ]"); 
	      }
	     for (Country cn : countryDAO.getCapital()) {
	         System.out.println("Country: [ Id : "+cn.getCountryId()+", Name : "+cn.getCountryName() 
	        		 + ", Population : "+cn.getPopulation() + " , CityId : " +cn.getCityId() + " ]");
	      }
	}
}