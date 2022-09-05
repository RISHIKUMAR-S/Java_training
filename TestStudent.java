import java.util.Objects;

class Student{  

    private String name;
    private int id;

    Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
		return getClass().getName() + " " + "\n" + 
        "  Name : " + this.name + " " + "\n" + 
		" Empid: " + this.id + " " + "\n" +
		" hashcode : " + this.hashCode();
	}

    @Override
    public int hashCode() {
        int result = 0;
        result = result + id;
        result = result + ( name != null ? name.hashCode() : 0 );
        return result;
    }

    @Override
	public boolean equals(Object obj) {

		if (obj == this) {
			return true;
		}

		/* Check if obj is an instance of student or not
          "null instanceof [type]" also returns false */
		
		if (!(obj instanceof Student && this instanceof Student)) {
            return false;
        }

		Student anthorperson = (Student) obj;
		
		if (this.id != anthorperson.id) {
			return false;
		}

		if (!this.name.equals(anthorperson.name)) {
			return false;
		}
        
		return true;
	}

}

public class TestStudent{  
    public static void main(String[] args){  
        Student rishi = new Student("Rishi",15);
        Student Abi = new Student("Rishi",15);
        //System.out.println("tostring "+ rishi + "\n");
        System.out.println("equals of rishi and abi : "+rishi.equals(Abi) + "\n");
    }
} 