package CountryCity;

import java.util.List;

public interface CityDAO {
	   public City getCity(int id);
	   public List<City> getAllCities(); 
	   public List<City> getCityId(); 
	   public List<City> getCapital();
	   /*public boolean updateStudent(Student student);
	   public void deleteStudent(Student student);*/
}

