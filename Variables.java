public class Variables {
    public String name = "Math"; //instance variable
    public static int mark = 90; //static variable
    public static void main(String[] args){
        int rollno = 456; //local variable
        Variables student = new Variables();
        System.out.println("Subject name is: " + student.name);
        System.out.println("Mark is: " + Variables.mark);
        System.out.println("Roll number is: " + rollno);
    }
    
}
