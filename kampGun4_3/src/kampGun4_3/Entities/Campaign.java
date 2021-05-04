package kampGun4_3.Entities;

import kampGun4_3.Abstarct.EntityService;

public class Campaign implements EntityService{

	private String name;
	private double discountRate;
		
		public Campaign(String name, double discountRate) {
			super();
			this.name = name;
			this.discountRate = discountRate;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getDiscountRate() {
			return discountRate;
		}

		public void setDiscountRate(double discountRate) {
			this.discountRate = discountRate;
		}
	
}
