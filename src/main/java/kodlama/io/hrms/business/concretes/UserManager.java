package kodlama.io.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.UserService;
import kodlama.io.hrms.dataAccess.abstracts.UserDao;
import kodlama.io.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService{
	
	@Autowired
	private UserDao userDao ;

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
