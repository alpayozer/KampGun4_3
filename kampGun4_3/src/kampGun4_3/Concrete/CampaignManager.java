package kampGun4_3.Concrete;

import kampGun4_3.Abstarct.CampaignService;
import kampGun4_3.Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+" firsatlari geldiii.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+" firsatlari sona ermistir.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName()+" firsatlari guncellenmistir.");
		
	}

}
