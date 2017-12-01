
public class Session {
	
	Account account;
	Story[] masterListOfStories;
	View view;
	
	Boolean populateFeed(int[] listOfFriends) {
		/* TODO
		 * This method populates the user's feed using the user's friend's stories.
		 */
		return null;
	}
	Account createAccount(String userName, String password) {
		/* TODO
		 * Each account has a password. 
		 * Don't store in plaintext. When a user creates an account, they enter a password in plaintext. We must use bcrypt 
		 * (https://docs.spring.io/spring-security/site/docs/current/apidocs/org/springframework/security/crypto/bcrypt/BCrypt.html)
		 * to hash the password, and we will store the hash in the DB. When a user tries to log in, the plaintext password they
		 * enter will get hashed using the same hash function above (bcrypt), and we will check that hash against the stored hash
		 * in the DB. If they match, the user entered the correct password and we will continue. If they don't match, the user
		 * entered an incorrect password.
		 */
		return null;
	}
	Account logIn(String userName, String password) {
		/* TODO
		 * Each account has a password. 
		 * Don't store in plaintext. When a user creates an account, they enter a password in plaintext. We must use bcrypt 
		 * (https://docs.spring.io/spring-security/site/docs/current/apidocs/org/springframework/security/crypto/bcrypt/BCrypt.html)
		 * to hash the password, and we will store the hash in the DB. When a user tries to log in, the plaintext password they
		 * enter will get hashed using the same hash function above (bcrypt), and we will check that hash against the stored hash
		 * in the DB. If they match, the user entered the correct password and we will continue. If they don't match, the user
		 * entered an incorrect password.
		 */
		return null;
	}
	void notifyAllAccounts() {
		/* TODO
		 * Notifies all accounts of any changes.
		 */
	}
	
}
