package CountryCity;

import java.util.List;

public interface CountryDAO {
	public Country getCountry(int id);
	public List<Country> getAllCountries();
	public List<Country> getCityId(); 
	public List<Country> getCapital();
}
