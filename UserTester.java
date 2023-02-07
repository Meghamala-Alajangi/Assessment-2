package Assessment;

public class UserTester {

	public static void main(String[] args) {
		User user=new User(101, "Jack", "jack@dxc.com", 1000);
		KYCUser kycUser=new KYCUser(201, "Jill", "jill@dxc.com", 3000);
		processPayment(user, 700);
		processPayment(kycUser, 1500);
		processPayment(kycUser, 800);
		processPayment(kycUser, 1200);
		}
	public static void processPayment(User user, double billAmount) {
		if(user.makePayment(billAmount)) {
			System.out.println("Congratulations " + user.getUserName() + ", payment of $" + billAmount + "was successful");
		}
		else {
			System.out.println("Sorry " + user.getUserName() + ",  not enough balance to make payment");
		}
		System.out.println("Your walletBalance is $" + user.getWalletBalance());
		
		if(user instanceof KYCUser) {
			KYCUser kycUser=(KYCUser) user;
			System.out.println("You have " + kycUser.getRewardPoints() + "reward points");
		}
		System.out.println();
	}

}
