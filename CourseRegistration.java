package Assessment;

public class CourseRegistration {

	String studentname;
	int registrationid;
	float qualifyingmarks;
	double coursefee;
	int courseid;
	boolean hostelrequired;
	
	public CourseRegistration(String studentname, int registrationid, float qualifyingmarks, int courseid, boolean hostelrequired) {
		
		this.studentname = studentname;
		this.registrationid = registrationid;
		this.qualifyingmarks = qualifyingmarks;
		this.courseid = courseid;
		this.hostelrequired = hostelrequired;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getRegistrationid() {
		return registrationid;
	}
	public void setRegistrationid(int registrationid) {
		this.registrationid = registrationid;
	}
	public float getQualifyingmarks() {
		return qualifyingmarks;
	}
	public void setQualifyingmarks(float qualifyingmarks) {
		this.qualifyingmarks = qualifyingmarks;
	}
	public double getCoursefee() {
		return coursefee;
	}
	public void setCoursefee(double coursefee) {
		this.coursefee = coursefee;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public boolean isHostelrequired() {
		return hostelrequired;
	}
	public void setHostelrequired(boolean hostelrequired) {
		this.hostelrequired = hostelrequired;
	}
	boolean ishostelrequired() {
		if(this.hostelrequired==true) {
			return true;
		}
		else
			return false;
	}
	boolean validatemarks() {
		if(qualifyingmarks>65) {
			return true;
		}
		else
			return false;
	}
	boolean validatecourseid() {
		if(courseid>=1001&&courseid<=1005) {
			return true;
			
		}
		return false;
	}
	void calculatecoursefee() {
		double discount=0,fee=0;
		if(qualifyingmarks>=65&&qualifyingmarks<=69) {
			discount=0.05;
		}
		else if (qualifyingmarks>=70&&qualifyingmarks<=84) {
			discount=0.1;
		}
		else if(qualifyingmarks>=85){
			discount=0.15;
		}
		
		if(courseid==1001) {
			fee=55000 -55000*discount;
		}
		else if(courseid==1002) {
			fee=35675 -35675*discount;
		}
		else if(courseid==1003) {
			fee=28300 -28300*discount;
		}
		else if(courseid==1004) {
			fee=22350 -22350*discount;
		}
		else if(courseid==1005) {
			fee=115000 -115000*discount;
		}
		System.out.println("total course fee: " +fee);
	}
}	