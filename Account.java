import java.util.ArrayList;
import java.util.List;

public class Account {
	long id;
	String AccountType;
	
	public Account(int a, String b){
		super();
		this.id=a;
		this.AccountType=b;
	}

	
	public static List<Account> createAccounts(int numAccounts){
			List<Account> a1 = new ArrayList<>(); 
			while(numAccounts>0) {
				Account a= new Account(1,"savings");
				a1.add(a);
				numAccounts--;
			}
			return a1;

		}
	public String toString() {
		return "Account [id: " + this.id + this.AccountType +"]";
	}

		
	}


