package kampGun4_3.Concrete;

import kampGun4_3.Abstarct.GameService;
import kampGun4_3.Entities.Game;


public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " adli oyun sisteme eklenmistir.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " adli oyun sistemden kaldirilmistir.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " adli oyuna guncelleme gelmistir.");
		
	}


}
