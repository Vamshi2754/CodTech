import java.util.*;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of subjects: ");
        int n = sc.nextInt();
        
        double total =0;

        for(int i=0;i<n;i++){
            System.out.println("Marks: "+(i+1)+": ");
            double marks = sc.nextDouble();
            if(marks>100){
                System.out.println("Out of range of marks");
                break;
            } else{
            
            total+=marks;
            }
        }
        if(total<=100*n){
        double avg = total/n;

        char grade = (avg>=90)?'A':(avg>=80)?'B':(avg>=70)?'C':(avg>=60)?'D':'F';

        System.out.println("Total Marks: "+total);
        System.out.println("Averge of all Subjects: "+avg+"%");
        System.out.println("Grade: "+ grade);
        
        
        
    }

}
}
