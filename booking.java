import java.util.Scanner;
public class booking extends checking {                              //BOOKING SECTION STARTED.....
    int seats, i = 0;
    static int count = 100;
    int age[] = new int[10];
    int amt[] = new int[10];
    int arr[] = new int[10];


    Scanner sc = new Scanner(System.in);

    public void book() {

        System.out.println("\t\tBOOKING SECTION");
        System.out.println("seats");
        seats = sc.nextInt();
        for (i = 1; i <= seats; i++) {


            System.out.println("name:");
            name[i] = sc.next();

            System.out.println("gender");
            gender[i] = sc.next();

            System.out.println("age:");
            age[i] = sc.nextInt();

            System.out.println("\t\t\tkindly enter the correct starting and ending point carefully if you enterd wrongly you have to start from first , so be careful!!!");
            System.out.println("Enter The Starting Point:");

            start[i] = sc.next();

            System.out.println("Enter The Destination Point:");

            end[i] = sc.next();


            if (start[i].equals("chennai") && end[i].equals("salem")) {
                System.out.println("Select the express");
                System.out.println("1.Chennai Exp");
                System.out.println("2.MGR exp");
                System.out.println("3.CITY exp");
                System.out.println("select your choice");
                exp[i] = sc.next();

                switch (exp[i]) {
                    case "chennaiexp":
                        System.out.println("chennai express");
                        break;

                    case "mgrexp":
                        System.out.println("you selected Mgr express");
                        break;

                    case "cityexp":
                        System.out.println("you selected city express");
                        break;
                }
            } else if (start[i].equals("chennai") && end[i].equals("erode")) {
                System.out.println("the followed express are available from chennai to erode");
                System.out.println("1.Kvm exp");
                System.out.println("2.Kobra exp");
                System.out.println("3.erode exp");
                System.out.println("select your choice");

                exp[i] = sc.next();


                switch (exp[i]) {

                    case "kvmexp":
                        System.out.println("you selected kvm express");
                        break;

                    case "kobraexp":
                        System.out.println("you selected kobra express");
                        break;

                    case "erodeexp":
                        System.out.println("you selected erode express");
                        break;
                }

            } else if (start[i].equals("chennai") && end[i].equals("kovai")) {
                System.out.println("the followed express are available from chennai to erode");
                System.out.println("1.Kovai exp");
                System.out.println("2.ooty exp");
                System.out.println("3.jaya exp");
                System.out.println("select your choice");
                exp[i] = sc.next();

                switch (exp[i]) {
                    case "kovaiexp":
                        System.out.println("you selected kovai express");
                        break;

                    case "ootyexp":
                        System.out.println("you selected ooty express");
                        break;

                    case "jayaexp":
                        System.out.println("you selected jaya express");
                        break;
                }

            } else {
                System.out.println("pls enter correct location");
                book();

            }
            System.out.println("select your level");
            System.out.println("-> A/C");
            System.out.println("-> SLEEPER");
            System.out.println("-> GENERAL");
            level[i] = sc.next();

            switch (level[i]) {
                case "A/c":
                    System.out.println("your selected A/C level ");
                    break;

                case "sleeper":
                    System.out.println("your selected SLEEPER level");
                    break;

                case "general":
                    System.out.println("you selected GENERAL level");
                    break;

                default:
                    System.out.println("choose correct choice");
                    break;

            }


            System.out.print("Enter the Amount:");
            amt[i] = sc.nextInt();
        }
        display();
        //System.out.println(count);

    }                                                                       // BOOKING SECTION CLOSED......

    public void display() {                                                   // DISPLAY SECTION STARTED....


        System.out.println("\t\tDISPLAY SECTION");
        for (i = 1; i <= seats; i++) {
            System.out.println("\t\tPerson " + i + " Details");
            System.out.println("TOTAL NUMBER OF SEATS" + seats);
            System.out.println("NAME:" + name[i]);
            System.out.println("GENDER:" + gender[i]);
            System.out.println("AGE:" + age[i]);

            System.out.println("YOUR STARTING POINT WAS:" + start[i]);
            System.out.println("YOUR ENDING POINT WAS:" + end[i]);
            System.out.println("EXPRESS:" + exp[i]);
            System.out.println("LEVEL:" + level[i]);
            System.out.println("AMOUNT:" + amt[i] + "\n");
            count--;


            System.out.println("!Thanks for booking!");
        }

    }                                                                         // DISPLAY SECTION CLOSED....


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        checking obj = new checking();
        booking obj1 = new booking();


        System.out.println("\t\t WELCOME TO CHENNAI RAILWAY STATION");
        while (1 != 0) {
            System.out.println("********************************************************");
            System.out.println("\nFor checking press . 1");
            System.out.println("For booking press . 2");
            System.out.println("For exit press . 3 ");
            System.out.print("Enter your choice:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    obj.check();
                    break;

                case 2:
                    obj1.book();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }


    }
}