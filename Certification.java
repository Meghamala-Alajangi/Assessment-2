package Assessment;

interface Certification {
		  double REGULAR_COURSE_FEE = 2000.0;
		  double CRASH_COURSE_FEE = 5000.0;
		  double calculateFee();
		}

class RRTechnicalCertification implements Certification {
		  private String studentName;
		  private String courseName;
		  private int admissionTestMarks;
		  private int registrationId;
		  private static int counter = 1001;

		  public RRTechnicalCertification(String studentName, String courseName, int admissionTestMarks) {
		    this.studentName = studentName;
		    this.courseName = courseName;
		    this.admissionTestMarks = admissionTestMarks;
		    generateRegistrationId();
		  }

		  public String getStudentName() {
		    return studentName;
		  }

		  public String getCourseName() {
		    return courseName;
		  }

		  public void setCourseName(String courseName) {
		    this.courseName = courseName;
		  }

		  public int getRegistrationId() {
		    return registrationId;
		  }

		  public void setRegistrationId(int registrationId) {
		    this.registrationId = registrationId;
		  }

		  public int getAdmissionTestMarks() {
		    return admissionTestMarks;
		  }

		  public void setAdmissionTestMarks(int admissionTestMarks) {
		    this.admissionTestMarks = admissionTestMarks;
		  }

		  public void generateRegistrationId() {
		    registrationId = counter;
		    counter += 2;
		  }

		  public double calculateFee() {
		    return 0.0;
		  }
		}

class RegularCourseCertification extends RRTechnicalCertification {
		  private int courseDuration;

		  public RegularCourseCertification(String studentName, String courseName, int admissionTestMarks, int courseDuration) {
		    super(studentName, courseName, admissionTestMarks);
		    this.courseDuration = courseDuration;
		  }

		  public int getCourseDuration() {
		    return courseDuration;
		  }

		  public void setCourseDuration(int courseDuration) {
		    this.courseDuration = courseDuration;
		  }

		  @Override
		  public double calculateFee() {
		    double discount = 0.0;
		    if (getAdmissionTestMarks() >= 90) {
		      discount = 0.1 * getCourseDuration() * REGULAR_COURSE_FEE;
		    } else if (getAdmissionTestMarks() >= 75) {
		      discount = 0.05 * getCourseDuration() * REGULAR_COURSE_FEE;
		    }
		    return getCourseDuration() * REGULAR_COURSE_FEE - discount;
		  }
		}

class CrashCourseCertification extends RRTechnicalCertification {
		  public CrashCourseCertification(String studentName, String courseName, int admissionTestMarks) {
		    super(studentName, courseName, admissionTestMarks);
		  }

		  @Override
		  public double calculateFee() {
		    double discount = 0.0;
		    if (getAdmissionTestMarks() >= 90) {
		      discount = 0.1 * CRASH_COURSE_FEE;
		    } else if (getAdmissionTestMarks() >= 75) {
		      discount = 0.05 * CRASH_COURSE_FEE;
}
			return discount;
		  }
}