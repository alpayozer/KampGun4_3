package kampGun4_3.Concrete;

import kampGun4_3.Abstarct.UserService;
import kampGun4_3.Abstarct.UserValidator;
import kampGun4_3.Entities.User;

public class UserManager implements UserService, UserValidator{

	@Override
	public boolean validator(User user) {
		if(user.getNationaltyId() != null && user.getFirstName() != null && user.getLastName() != null && user.getDateOfBirth() != null) {
			return true;
		}else {
			return false;
		}
		
	}
	
	@Override
	public void add(User user) {
		if(validator(user)) {
			System.out.println(user.getFirstName() + " adli kullanici hesabini olusturdu.");
		}else {
			System.out.println("Lutfen bilgilerinizi tam giriniz.");
		}
		
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " adli kullanici hesabini sildi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " adli kullanici hesabini guncelledi.");
		
	}

	@Override
	public void loadMoney(User user) {
		System.out.println(user.getFirstName() + " adli kullanici "+user.getCardId()+" hesabina para yukledi.");
		
	}




	

}
