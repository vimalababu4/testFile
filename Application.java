import java.util.ArrayList;
import java.util.List;

public class Application {
	public static void main(String [] args) {
		int numAccounts=3;
		
		List<Account> accounts = Account.createAccounts(numAccounts);
		for(int i=0;i<numAccounts;i++) {
			System.out.println(accounts.get(i));
			System.out.println("Hello Java");
			System.out.println("made second changes to application java")
			System.out.println("adding new branch and shifting this code to develop branch");
			System.out.println("adding new change to new branch");
		}

		
	}

}
