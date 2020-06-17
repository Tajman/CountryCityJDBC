package CountryCity;

public class City {

		private String name;
		private String isCapital;
		private int cityId;
		
		public City() {
		}
		
		public City(String name, String isCapital, int cityId) {
			super();
			this.name = name;
			this.isCapital = isCapital;
			this.cityId = cityId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getIsCapital() {
			return isCapital;
		}

		public void setIsCapital(String isCapital) {
			this.isCapital = isCapital;
		}

		public int getCityId() {
			return cityId;
		}

		public void setCityId(int cityId) {
			this.cityId = cityId;
		}
		
			
	

}
