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
		// Add your implementation here
                  return students;
		//return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
               this.students=students;
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
               
                   int l=students.length;
                    if(index==0||index>=l){
                       throw new IllegalArgumentException();
                   
                    }
                 else{
                     return students[index];
                   }
                //return null;
                
		
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
             int l=students.length;
             if(student==null || index<0 || index>=l)
            { throw new IllegalArgumentException();}

            else
            {
            students[index]=student;
            }
 
             
	}

	@Override
	public void addFirst(Student student) {
		
          if(student==null)
          {
           throw new IllegalArgumentException();
           }// Add your implementation here
          else
          {
           students[0]=student;
           }
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
            int l=students.length;
            if(student==null)
          {
           throw new IllegalArgumentException();
           }
          else
          {
           students[l]=student;
           }
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		
              int l=students.length;
             if( index<0 || index>=l)
            { throw new IllegalArgumentException();}

            else
            {
             for(int i=index;i<l-1;i++)
             {
              students[i]=students[i+1];
             }
             students[l]=null;
            }// Add your implementation here
	}

	@Override
	public void remove(Student student) {
                int l=students.length ;
                int flag=1;
		if(student==null)
                {
                throw new IllegalArgumentException();
                }// Add your implementation here
                
                else
                {
                for(int i=0;i<l;i++)
                {
                 if(students[i].equals(student))
                 {
                  flag=0;
                  for(int j=i;i<l-1;j++)
                 {
              	students[j]=students[j+1];
            	 }
            	 students[l]=null;
                   }
                 }
                }
             if(flag==1)
             {
              System.out.println("Student not exist");
              throw new IllegalArgumentException();
              }
               
	}

	@Override
	public void removeFromIndex(int index) { 
                 int l=students.length; 
		if(index<0||index>=l)
                  {throw new IllegalArgumentException();}
                else
                {
                   for(int i=index;i<l-1;i++)
                    {
                       students[i]=null;
                    }
                }// Add your implementation here
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
