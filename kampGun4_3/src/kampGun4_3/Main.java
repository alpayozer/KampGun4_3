package kampGun4_3;

import kampGun4_3.Concrete.CampaignManager;
import kampGun4_3.Concrete.GameManager;
import kampGun4_3.Concrete.SaleManager;
import kampGun4_3.Concrete.UserManager;
import kampGun4_3.Entities.Campaign;
import kampGun4_3.Entities.Game;
import kampGun4_3.Entities.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1,"012345600","Alpay","Ozer","2002","TR556666");
		User user2 = new User(2,null,"Murat","Seker","2005","TR77985");
		
		Campaign campaign1 = new Campaign("Black Friday",20);
		Campaign campaign2 = new Campaign("Anneler günü",50);
		
		Game game1 = new Game(1,"Valorant","Riot Games",150,campaign1);
		Game game2 = new Game(2,"Fifa 21","EA Games",250,campaign2);
		
		UserManager userManager = new UserManager();
		
		userManager.validator(user2);
		userManager.validator(user1);
		userManager.add(user1);
		userManager.add(user2);
		userManager.delete(user2);
		userManager.update(user1);
		userManager.loadMoney(user1);
		
		SaleManager saleManager1 = new SaleManager();
		SaleManager saleManager2 = new SaleManager();
		
		saleManager1.sale(game1, user1, campaign1);
		saleManager2.sale(game2, user2, campaign2);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game2);
		gameManager.delete(game1);
		gameManager.update(game2);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign2);
		campaignManager.delete(campaign1);
		campaignManager.update(campaign1);
		
	
	
	}

}
