package CountryCity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CityDAOClass implements CityDAO {

	 //list is working as a database
	   List<City> cityList;

	   public CityDAOClass(){
		  cityList = new ArrayList<City>(); 
		}
	
	   //retrieve list of Cities from the database
	   @Override
	     public List <City> getAllCities() {
			   Connection con = ConnectionFactory.getConnection();
			    try {
			        Statement stmt = con.createStatement();
			        ResultSet rs = stmt.executeQuery("SELECT * FROM City");
			        List<City> cityList = new ArrayList<City>();

			        while(rs.next())
			        {
		            	City c = new City();
		                c.setCityId(rs.getInt("CityId")); 
		                c.setName(rs.getString("Name") );
		                c.setIsCapital(rs.getString("isCapital") );
			            cityList.add(c);
			        }
			        return cityList;
			    } catch (SQLException ex) {
			        ex.printStackTrace();
			    }
			    return null;
			}
	   

	   @Override
	   public City getCity(int id) {
		    Connection con = ConnectionFactory.getConnection();
		        try {
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("SELECT * FROM City WHERE CityId=" + id);
		            if(rs.next())
		            {
		            	City c = new City();
		            	c.setCityId(rs.getInt("CityId")); 
		                c.setName(rs.getString("Name") );
		                c.setIsCapital(rs.getString("isCapital") );
		            return c;
		            }
		        } catch (SQLException ex) {
	            ex.printStackTrace();
		        }
		    return null;
		} 
	   
	   @Override
	     public List <City> getCityId() {
			   Connection con = ConnectionFactory.getConnection();
			    try {
			        Statement stmt = con.createStatement();
			        ResultSet rs = stmt.executeQuery("SELECT * FROM City WHERE CityId = 3");
			        List<City> cityList = new ArrayList<City>();

			        while(rs.next())
			        {
		            	City c = new City();
		                c.setCityId(rs.getInt("CityId")); 
		                c.setName(rs.getString("Name") );
		                c.setIsCapital(rs.getString("isCapital") );
			            cityList.add(c);
			        }
			        return cityList;
			    } catch (SQLException ex) {
			        ex.printStackTrace();
			    }
			    return null;
			} 
	   
	   @Override
	     public List <City> getCapital() {
			   Connection con = ConnectionFactory.getConnection();
			    try {
			        Statement stmt = con.createStatement();
			        ResultSet rs = stmt.executeQuery("SELECT * FROM City WHERE isCapital = 'Y'");
			        List<City> cityList = new ArrayList<City>();

			        while(rs.next())
			        {
		            	City c = new City();
		                c.setCityId(rs.getInt("CityId")); 
		                c.setName(rs.getString("Name") );
		                c.setIsCapital(rs.getString("isCapital") );
			            cityList.add(c);
			        }
			        return cityList;
			    } catch (SQLException ex) {
			        ex.printStackTrace();
			    }
			    return null;
			}

	   
//	   @Override
//	     public boolean updateStudent(Student s) {
//		    Connection connection = ConnectionFactory.getConnection();
//		    try {
//		        PreparedStatement ps = connection.prepareStatement("UPDATE student SET firstname=?, lastname=? WHERE id=?");
//		        ps.setString(2, s.getFirstname());
//		        ps.setString(3, s.getLastname());
//		        ps.setInt(1, s.getStudentid());
//		      
//		        int i = ps.executeUpdate();
//
//		      if(i == 1) {
//		    	  return true;
//		      }
//		    } catch (SQLException ex) {
//		        ex.printStackTrace();
//		    }
//		    return false;
//		}
//	   
//	   @Override
//	   public void deleteStudent(Student stud) {
//	   }

}


