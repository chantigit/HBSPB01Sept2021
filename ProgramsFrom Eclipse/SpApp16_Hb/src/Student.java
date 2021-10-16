public class Student implements java.io.Serializable
{
	private int studentId;
	private String studentName;
	private int marks;
	//setters & getters
	public void setStudentId(int studentId)
	{
		this.studentId=studentId;
	}
	public int getStudentId()
	{
		return studentId;
	}
	public void setStudentName(String studentName)
	{
		this.studentName=studentName;
	}
	public String getStudentName()
	{
		return studentName;
	}
	public void setMarks(int marks)
	{
		this.marks=marks;
	}
	public int getMarks()
	{
		return marks;
	}
}