package Assessment;

public class User {
	private int id;
	private String userName, emailId;
	private double walletBalance;
	
	public User(int id, String userName, String emailId, double walletBalance) {
		this.id=id;
		this.userName=userName;
		this.emailId=emailId;
		this.walletBalance=walletBalance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public double getWalletBalance() {
		return walletBalance;
	}

	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}
	
	public boolean makePayment(double billAmount) {
		if(billAmount <= getWalletBalance()) {
			setWalletBalance(getWalletBalance()-billAmount);
			return true;
		}
		return false;
	}
}

class KYCUser extends User {
	private int rewardPoints;
	public KYCUser(int id, String userName, String emailId, double walletBalance) {
		super(id, userName, emailId, walletBalance);
	}
	public int getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	
	
	public boolean makePayment(double billAmount) {
		if(billAmount <= getWalletBalance()) {
			setRewardPoints(getRewardPoints()+(int)(billAmount*0.1));
		}
		return super.makePayment(billAmount);
	}
}