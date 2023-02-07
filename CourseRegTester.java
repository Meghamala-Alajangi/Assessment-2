package Assessment;

public class CourseRegTester {
	public static void main(String[] args)
	{
		CourseRegistration k1=new CourseRegistration("Peter",5001,58f,1005,true);
		CourseRegistration k2 = new CourseRegistration("Peter",5001,68,1006,true);
		CourseRegistration k3 = new CourseRegistration("Peter",5001,78,1005,false);
		
		CourseRegistration[] studentlist = { k1, k2, k3 };
		for(CourseRegistration s:studentlist) {
			
		
		if(s.validatemarks()== true&&s.validatecourseid()==true)
		{
			System.out.println("**** Course Allocation Details**** ");
			System.out.println("Student name : " +s.getStudentname());
			System.out.println("Course Id : " +s.getCourseid());
			System.out.println("Qualifying exam marks : " +s.getQualifyingmarks());
			System.out.println("Student's registration id : " +s.getRegistrationid());
			System.out.println("Total course fee : " +s.getCoursefee());
			System.out.println("Hostel required : " +s.isHostelrequired());
		}
		else if( s.validatemarks()==false){
			System.out.println("Marks is lessthan 65 you are not eligible for admission");
		}
		else if (s.validatecourseid()==false) {
			System.out.println("Invalid Course Id . Please try again");
		}
	    }
	}
}