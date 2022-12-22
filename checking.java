import java.util.Scanner;

public class checking {

    int choice, i;
    String start[] = new String[10];
    String end[] = new String[10];
    String name[] = new String[10];
    String gender[] = new String[10];
    String level[] = new String[10];
    String exp[] = new String[10];

    public void check() {                                                      // CHECKING SECTION STARTED......

        while (1 != 0) {
            System.out.println("\t\tCHECKING SECTION");

            Scanner sc = new Scanner(System.in);
            System.out.print("enter your starting point:");
            start[i] = sc.next();


            System.out.print("enter your ending point:");
            end[i] = sc.next();


            if (start[i].equals("chennai") && end[i].equals("salem")) {
                System.out.println("\t the followed express are available from chennai to salem");
                System.out.println("1.CHENNAI exp");
                System.out.println("2.MGR exp");
                System.out.println("3.CITY exp");
                System.out.println("select your choice");
                 exp[i]=sc.next();

                switch (exp[i]) {
                    case "chennaiexp":
                        System.out.println("\tTiming for Chennai exp is: 12.00 pm");
                        System.out.println("\tReach your Destination at 7.00 pm");
                        System.out.println("\tplatform no is 01");
                        System.out.println("Price of chennai exp \n\t\t A/c = 1000\n\t\t sleeper = 750\n\t\t general = 400");
                        break;

                    case "mgrexp":
                        System.out.println("\tTiming for MGR exp is: 4.00 am");
                        System.out.println("\tReach your Destination at 10.00 am");
                        System.out.println("\tplatform no is 07");
                        System.out.println("Price of MGR exp \n\t\t A/c = 1200\n\t\t sleeper = 700\n\t\t general = 200");
                        break;

                    case "cityexp":
                        System.out.println("\tTiming for City exp is: 11.45 pm");
                        System.out.println("\tReach your Destination at 8.00 am");
                        System.out.println("\tplatform no is 10");
                        System.out.println("Price of city exp \n\t\t A/c = 1100\n\t\t sleeper = 550\n\t\t general = 100");
                        break;

                    default:
                        System.out.println("pls select correct choice...");
                        break;
                }
            }


          else if (start[i].equals("chennai") && end[i].equals("erode")) {
                System.out.println("the followed express are available from chennai to erode");
                System.out.println("1.Kvm exp");
                System.out.println("2.Kobra exp");
                System.out.println("3.erode exp");
                System.out.println("select your choice");
                exp[i] = sc.next();

                switch (exp[i]) {
                    case "kvmexp":
                        System.out.println("\nTiming for Kvm exp is 3.00 am");
                        System.out.println("\nReach your Destination at 11.30 am");
                        System.out.println("\nplatform no is 03");
                        System.out.println("Price of KVM exp \n\t\t A/c = 1300\n\t\t sleeper = 850\n\t\t general = 450");
                        break;

                    case "kobraexp":
                        System.out.println("\nTiming for Kobra exp is 5.30 am");
                        System.out.println("\nReach your Destination at 12.30 pm");
                        System.out.println("\nplatform no is 05");
                        System.out.println("Price of Kobra exp \n\t\t A/c = 1250\n\t\t sleeper = 600\n\t\t general = 250");
                        break;

                    case "erodeexp":
                        System.out.println("\tTiming for Erode exp is 1.00 am");
                        System.out.println("\tReach your Destination at 7.30 am");
                        System.out.println("\tplatform no is 07");
                        System.out.println("Price of erode exp \n\t\t A/c = 1150\n\t\t sleeper = 540\n\t\t general = 150");
                        break;
                    default:
                        System.out.println("pls enter correct choice...");
                }
            }


           else if (start[i].equals("chennai") && end[i].equals("kovai")) {
                System.out.println("the followed express are available from chennai to erode");
                System.out.println("1.Kovai exp");
                System.out.println("2.ooty exp");
                System.out.println("3.jaya exp");
                System.out.println("select your choice");
                exp[i] = sc.next();

                switch (exp[i]) {
                    case "kovaiexp":
                        System.out.println("\tTiming for kovai exp is 3.00 am");
                        System.out.println("\tReach your Destination at 11.30 am");
                        System.out.println("\tplatform no is 05");
                        System.out.println("Price of Kovai exp \n\t\t A/c = 700\n\t\t sleeper = 450\n\t\t general = 100");
                        break;

                    case "ootyexp":
                        System.out.println("\tTiming for ooty exp is 5.30 am");
                        System.out.println("\tReach your Destination at 12.30 pm");
                        System.out.println("\tplatform no is 03");
                        System.out.println("Price of Ooty exp \n\t\t A/c = 1250\n\t\t sleeper = 350\n\t\t general = 100");
                        break;

                    case "jayaexp":
                        System.out.println("\tTiming for jaya exp is 1.00 am");
                        System.out.println("\tReach your Destination at 7.30 am");
                        System.out.println("\tplatform no is 06");
                        System.out.println("Price of Jaya exp \n\t\t A/c = 1140\n\t\t sleeper = 250\n\t\t general = 140");
                        break;
                    default:
                        System.out.println("pls enter correct choice...");
                }
            }
           else{
                System.out.println("Please Enter Correct choice");
            }

        }
    }                                                                        // CHECKING SECTION CLOSED.....


    }