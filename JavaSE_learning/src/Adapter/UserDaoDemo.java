package Adapter;

public class UserDaoDemo {

	public static void main(String[] args) {
		// need an implementation before using interface class UserDao
		UserDao ud = new UserDaoImpl();
		ud.add();
		// issue: only need add, or one of the many functions, so too complicated.
		// ==> solution: Adapter
		UserDao ud2 = new UserDaoImpl2();
		ud2.add();
	}

}
