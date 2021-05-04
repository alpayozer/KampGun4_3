package kampGun4_3.Concrete;

import kampGun4_3.Abstarct.SaleService;
import kampGun4_3.Entities.Campaign;
import kampGun4_3.Entities.Game;
import kampGun4_3.Entities.User;

public class SaleManager implements SaleService{

	@Override
	public void sale(Game game, User user, Campaign campaign) {
		
		System.out.println(game.getName()+" adli oyun "+user.getFirstName()+
							" adli kullaniciya "+campaign.getName() + 
							" kampanyasindan yararlanilarak "+game.getPrice()+ 
							" fiyata satilmistir.");
		
	}

}
