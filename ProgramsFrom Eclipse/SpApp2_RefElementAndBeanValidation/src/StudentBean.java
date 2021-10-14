public class StudentBean				//OuterBean 
{
	private int rollNumber;
	private float percentage;
	private String studentName;
	private DobBean dob;				//InnerBean
	public StudentBean() {
		System.out.println("StudentBean.StudentBean()");
	}
	//Setter injection
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setDob(DobBean dob) {
		this.dob = dob;
	}
	//toString()
	@Override
	public String toString() {
		return "StudentBean [rollNumber=" + rollNumber + ", percentage=" + percentage + ", studentName=" + studentName
				+ ", dob=" + dob + "]";
	}
	


}
