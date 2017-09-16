 import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		Student[] s=new Student;
		
		
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		try
		{
		if(s==null)
		{
			throw IllegalArgumentException;
			
		}
		}
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
	try
{
if(Student[]==NULL)
	{
		throw IllegalArgumentException;
	}
}
catch
{
	if(index<0 || index>student.length)
	{
		throw IllegalArgumentException;
	}

			// Add your implementation here
		return null;
	}
}
	@Override
	public void setStudent(Student student, int index) {
		try
{
		if(student[]==null)
		{
			throw IllegalArgumentException;
		}
}
catch
{
		if(index<0 || index>student.length)
		{
			throw IllegalArgumentException;
		}
}		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		try
{
if(student[]==null)
		{
			throw IllegalArgumentException;
		}
}
catch
{
		if(student[]!=null)
		{
		int n;
		student[].add=int.Parseint(System.in(n));
		}
		else
		{
			throw IllegalArgumentException;
		}
}
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		
try
{
if(student[]==null)
		{
			throw IllegalArgumentException;
		}
}
catch
{
		if(student[]!=null)
		{
			int m;
			student[].add=int.Parseint(System.in(m));
		}
		else
		{
			throw IllegalArgumentException;
		}
}	
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
	try
	{

	if(index<0 || index>student[].length)
	{	
		for(int i=0;i<student[].length;i++)
		{
			student[i].remove(student,index);
		}
	}
	}
	catch
	{
		throw IllegalArgumentException;
	}

		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		try
		{
			if(student[]==null)		
			for(int i=0;i<student[].length;i++)
			{
				student[i].remove(Student student);
			}
		}
		catch
		{
			throw IllegalArgumentException;
		}
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {

		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
