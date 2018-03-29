package Adapter;

public class UserDaoImpl implements UserDao {

	public void add() {
		System.out.println("adding a new users");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("delete a users");
	}

	@Override
	public void upadte() {
		// TODO Auto-generated method stub
		System.out.println("updating a users");
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		System.out.println("serach a users");
	}

}
