package kampGun4_3.Abstarct;

import kampGun4_3.Entities.User;

public interface UserService{

	void add(User user);
	void delete(User user);
	void update(User user);
	void loadMoney(User user);
}
