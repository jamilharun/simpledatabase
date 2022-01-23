/*

simple 1 dimentional array to collect information

progress report:
uses: inputting data 
deleting data
searching data
updating data

ps. you can edit the code if you want to add more set of arrays


*/

package Java.java_crewde.simpledatabase;
import java.util.ArrayList;
import java.util.Scanner;

public class small_database {
    public static void main (String[] arg) {
        Scanner in = new Scanner(System.in);

        ArrayList<String>  student_name = new ArrayList<String>();
        ArrayList<Integer> student_number = new ArrayList<Integer>();

        System.out.println("hello this is a small data base: ");
        
        String rept = "", reptbase = "";
        int index;
        boolean finishbase = false;

        
        System.out.println("list of students: ");
        if (student_name == null && student_number == null){
            System.out.println("your arrays are null/empty");
        } else {
            for (int i =0;i<student_name.size();i++) {
                System.out.printf("{%d} / student Name: %s \t/ Student Number: %d  \n", i , student_name.get(i), student_number.get(i));
            }
        }

        do{
            boolean finishsub = false;
            System.out.println("1. Input new data \n2. Delete data \n3. Search data \n4. Updata data \n5. close program");
            int user_choices = in.nextInt();
            //in.nextInt();

            finishbase = false;

            switch (user_choices) {
                case 1:
                System.out.println("input new student record ");
                do{ 
                    System.out.println("input student name:");
                    student_name.add(in.nextLine());
                    //in.nextLine();
                    System.out.println("input stuendent number:");
                    student_number.add(in.nextInt());
                    in.nextLine();
                    
                    System.out.println("do you wanna input again? Yes  or No");
                    rept = in.nextLine();
                    
                    if (rept.equalsIgnoreCase("no")) {
                        finishsub = true;
                        break;
                    }
                } while (finishsub == false);
                break;

                case 2:
                System.out.println("delete student data");
                do{
                    for (int i =0;i<student_name.size();i++) {
                        System.out.printf("{%d} / student Name: %s \t/ Student Number: %d  \n", i , student_name.get(i), student_number.get(i));
                    }
                    System.out.println("type what data index you wish to delete");
                    index = in.nextInt();
                    student_name.remove(index);
                    student_number.remove(index);

                    rept = in.nextLine();
                    if (rept.equalsIgnoreCase("no")) {
                        finishsub = true;
                        break;
                    }

                }while(finishsub == false);
                break;

                case 3:
                System.out.println("search for student data ");
                do {
                    System.out.println("input for data index");
                    index = in.nextInt();
                    System.out.printf("[%d] Name: %s, student no. : %d ", index , student_name.get(index), student_number.get(index));

                    rept = in.nextLine();
                    if (rept.equalsIgnoreCase("no")) {
                        finishsub = true;
                        break;
                    }
                }while(finishsub == false);
                break;

                case 4:
                for (int i =0;i<student_name.size();i++) {
                    System.out.printf("{%d} / student Name: %s \t/ Student Number: %d  \n", i , student_name.get(i), student_number.get(i));
                }
                break;

                case 5:
                System.out.println("goodbye");
                finishbase = true;
                break;

                default: 
                    System.out.println("wrong input please try again! ");
                    break;
            }
        }while(finishbase == false);
    }
}

