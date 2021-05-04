package kampGun4_3.Abstarct;


import kampGun4_3.Entities.Campaign;
import kampGun4_3.Entities.Game;
import kampGun4_3.Entities.User;

public interface SaleService {

	void sale(Game game,User user,Campaign campaign);
	
}
