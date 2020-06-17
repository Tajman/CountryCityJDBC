package CountryCity; 

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CountryDAOClass implements CountryDAO { 
	
	//list is working as a database
	   List<Country> countryList;

	   public CountryDAOClass(){
		  countryList = new ArrayList<Country>(); 
		}
	
	   //retrieve list of Countries from the database
	   @Override
	     public List <Country> getAllCountries() {
			   Connection con = ConnectionFactory.getConnection();
			    try {
			        Statement stmt = con.createStatement();
			        ResultSet rs = stmt.executeQuery("SELECT * FROM Country");
			        List<Country> countryList = new ArrayList<Country>();

			        while(rs.next())
			        {
		            	Country cn = new Country();
		                cn.setCountryId(rs.getInt("CountryId")); 
		                cn.setCountryName(rs.getString("CountryName") );
		                cn.setPopulation(rs.getInt("Population") ); 
		                cn.setCityId(rs.getInt("CityId") );
			            countryList.add(cn);
			        }
			        return countryList;
			    } catch (SQLException ex) {
			        ex.printStackTrace();
			    }
			    return null;
			}
	   

	   @Override
	   public Country getCountry(int id) {
		    Connection con = ConnectionFactory.getConnection();
		        try {
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("SELECT * FROM Country WHERE CountryId=" + id);
		            if(rs.next())
		            {
		            	Country cn = new Country();
		            	cn.setCountryId(rs.getInt("CountryId")); 
		                cn.setCountryName(rs.getString("CountryName") );
		                cn.setPopulation(rs.getInt("Population") ); 
		                cn.setCityId(rs.getInt("CityId") );
		            return cn;
		            }
		        } catch (SQLException ex) {
	            ex.printStackTrace();
		        }
		    return null;
		} 
	   
	   @Override
	     public List <Country> getCityId() {
			   Connection con = ConnectionFactory.getConnection();
			    try {
			        Statement stmt = con.createStatement();
			        ResultSet rs = stmt.executeQuery("SELECT * FROM Country, City WHERE City.CityId = Country.CityId AND Country.CityId = 3");
			        List<Country> countryList = new ArrayList<Country>();

			        while(rs.next())
			        {
		            	Country cn = new Country();
		                cn.setCountryId(rs.getInt("CountryId")); 
		                cn.setCountryName(rs.getString("CountryName") );
		                cn.setPopulation(rs.getInt("Population") ); 
		                cn.setCityId(rs.getInt("CityId") );
			            countryList.add(cn);
			        }
			        return countryList;
			    } catch (SQLException ex) {
			        ex.printStackTrace();
			    }
			    return null;
			}  
	   
	   @Override
	     public List <Country> getCapital() {
			   Connection con = ConnectionFactory.getConnection();
			    try {
			        Statement stmt = con.createStatement();
			        ResultSet rs = stmt.executeQuery("SELECT * FROM Country, City WHERE City.CityId = Country.CityId AND City.isCapital = 'Y';");
			        List<Country> countryList = new ArrayList<Country>();

			        while(rs.next())
			        {
		            	Country cn = new Country();
		                cn.setCountryId(rs.getInt("CountryId")); 
		                cn.setCountryName(rs.getString("CountryName") );
		                cn.setPopulation(rs.getInt("Population") ); 
		                cn.setCityId(rs.getInt("CityId") );
			            countryList.add(cn);
			        }
			        return countryList;
			    } catch (SQLException ex) {
			        ex.printStackTrace();
			    }
			    return null;
			}

}
