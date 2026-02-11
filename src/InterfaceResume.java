import java.util.Scanner;

interface Resume {
    void biodata();
    
}

class Teacher implements Resume {
   String   Name;
   String Qualification;
   int Experience ;

    public void  biodata(){
	System.out.println( "Name: "+Name);
	System.out.println( "Qualification: "+Qualification);
	System.out.println( "Experience: "+Experience);
    }
}

public class InterfaceResume {
   public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        Teacher t1 = new Teacher();
	t1.Name = sc.next();
	t1.Qualification = sc.next();
	t1.Experience = sc.nextInt();
	t1.biodata();
        // Assign to teacher object attributes
        
        // TODO: Call teacher.biodata()
  }
    
}
