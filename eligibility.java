import java.util.Scanner;

/* 
 
 * 
 * Write a Java program that helps determine whether a 
 * student is eligible to be selected in the industry. 
 * The program should take input from the user regarding the student's qualifications, 
 * such as their GPA, relevant coursework, and extracurricular activities. 
 * Based on these inputs, the program should output "Selected" or "Not Selected."
 * 
 */

public class eligibility {

    public static void main(String[] args) {

        String names;
        Double gpa;
        String prolang;
        int leatcode;
        int experience;

        Scanner takeinput = new Scanner(System.in);

        System.out.println("Enter Your name : ");
        names = takeinput.nextLine();

        System.out.println("Enter your GPA : ");
        gpa = takeinput.nextDouble();

        System.out.println("Enter preferd programing language : ");
        prolang = takeinput.next();

        System.out.println("No of queations solved in leatcode : ");
        leatcode = takeinput.nextInt();

        System.out.println("How many year of Experience: ");
        experience = takeinput.nextInt();

        evaluateStudents(names,gpa,prolang,leatcode,experience);

        takeinput.close();
    }

    private static void evaluateStudents(
            String name, Double gpa, String proLanguage,
            int leatCodeQ, int experience

    ) {
        Double isGpa = 7.0;
        String isProlang = "java";
        int isleatcode = 75;
        int isexperience = 2;

        if (gpa > isGpa && proLanguage.equals(isProlang)
        && leatCodeQ > isleatcode && experience > isexperience
        ) {
            System.out.println(name + " is Selected" );
        }else{

            System.out.println(name + " not Selected");

            if (gpa < isGpa) {
             System.out.println("gpa is less than " + isGpa);   
            }
            if (proLanguage.toLowerCase() != isProlang) {
                System.out.println("we are hiring for " + isProlang);
            }
            if (leatCodeQ < isleatcode) {
                System.out.println("leatCode queation should be more than " + isleatcode);
            }
            if (experience < isexperience) {
                System.out.println("your experience is less than " + isexperience + " year");
            }
            
            
            
        }

    }

}