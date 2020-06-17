package CountryCity;

public class Country {

	private String countryName;
	private int population;
	private int countryId;
	private int cityId; 
	
	
	public Country(){
		
	}
	
	public Country(String countryName, int population, int countryId, int cityId) {
		super();
		this.countryName = countryName;
		this.population = population;
		this.countryId = countryId;
		this.cityId = cityId;
	}
	
	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	
	
}
