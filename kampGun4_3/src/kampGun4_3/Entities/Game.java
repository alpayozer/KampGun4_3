package kampGun4_3.Entities;

import kampGun4_3.Abstarct.EntityService;

public class Game implements EntityService{
	
	private int id;
	private String name;
	private String companyName;
	private double price;
	private Campaign campaign;
	
	public Game() {
		
	}

	public Game(int id, String name, String companyName, double price, Campaign campaign) {
		super();
		this.id = id;
		this.name = name;
		this.companyName = companyName;
		this.price = price;
		this.campaign = campaign;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getPrice() {
		double prc;
		if(campaign != null)
		{
			prc = (price*(100 - campaign.getDiscountRate()))/100;
		}
		else {
			prc = this.price;
		}
		return prc;
			
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

}
