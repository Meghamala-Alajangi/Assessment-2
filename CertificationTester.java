package Assessment;

public class CertificationTester {
	  RegularCourseCertification rcc = new RegularCourseCertification();
      rcc.studentName = "Rakesh";
      rcc.courseName = "J2EE";
      rcc.courseDuration = 5;
      rcc.admissionTestMarks = 85;
      rcc.calculateFee();

      System.out.println("1. Regular Course Registration Details");
      System.out.println("2. *************");
      System.out.println("3. Student Name : " + rcc.studentName);
      System.out.println("4. Course Name : " + rcc.courseName);
      System.out.println("5. Course Duration : " + rcc.courseDuration + " months");
      System.out.println("6. Registration ID : " + rcc.registrationID);
      System.out.println("7. Fees : " + rcc.fees);

      CrashCourseCertification ccc = new CrashCourseCertification();
      ccc.studentName = "Roshan";
      ccc.courseName = "Angular";
      ccc.admissionTestMarks = 71;
      ccc.calculateFee();

      System.out.println("1. Crash Course Registration Details");
      System.out.println("2. *************");
      System.out.println("3. Student Name : " + ccc.studentName);
      System.out.println("4. Course Name : " + ccc.courseName);
      System.out.println("5. Course Duration : " + ccc.courseDuration + " months");
      System.out.println("6. Registration ID : " + ccc.registrationID);
      System.out.println("7. Fees : " + ccc.fees);
}
