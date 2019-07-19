import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxeCapacity;
    private String alternateEmail;

    //Constructor firstname and lastname

    public Email (String firstName, String lastName) {
        this.firstName  = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: " + this.firstName + " " + this.lastName);

        //Call method to ask for department return the department
        this.department = setDepartment();
        System.out.println("Department: " + ""+ this.department);

        //Call a method that returns a random password


    }


    //Ask for the department

    private String setDepartment() {
        System.out.print("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\n Enter Department Code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();

        if(depChoice == 1) {
            return("Sales");
        }

        else if(depChoice == 2){
            return("Development");
        }

        else if(depChoice == 3){
            return("Accounting");
        }
        else {
            return("None");
        }

    }


    //Generate Password

    private String randomPassword(int length) {
        String passwordSet = "ABCEDFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
        char[] password = new char[length];
        for (int i = 0; i<length; i++){
            int rand =  (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);





    }


    //Set mailbox capacity


    //Set the alternate email

    //Change Password


}
