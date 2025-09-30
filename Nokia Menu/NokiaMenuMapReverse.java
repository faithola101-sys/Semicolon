import java.util.Scanner;

public class NokiaMenuReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("           NOKIA 3310 PHONE MENU");

        String[] menus = {"PhoneBook", "Messages", "Chat", "Call register"};
        String[] phoneBook = {"Search","Service Nos.","Add name","Erase","Options"};
        String[] options = {"Type of view","Memory status"};
        String[] messages = {"Write message","Inbox","Outbox","Message settings"};
        String[] messageSettings = {"Set 1","Common"};
        String[] messageSet1 = {"Message centre number","Message sent as","Message validity"};
        String[] messageCommon = {"Delivery reports","Reply via same centre","Character support"};
        String[] callRegister = {"Missed calls","Received calls","Dialled numbers","Erase recent call lists","Show call duration"};
        String[] callDuration = {"Last call duration","All calls' duration","Received calls' duration","Dialled calls' duration","Clear timers"};

       
        int i = 1;
        for (String menu : menus) {
            System.out.println(i + " " + menu);
            i++;
        }
        System.out.println("0 Exit");

        System.out.print("Pick Menu (0-4): ");
        int pick = input.nextInt();

        if (pick == 1) {
           
            for (int j = 0; j < phoneBook.length; j++) {
                System.out.println((j+1) + " " + phoneBook[j]);
            }
            System.out.println("0 Back");
            System.out.print("Choice (0-5): ");
            int choice = input.nextInt();

            if (choice == 1) {
                System.out.println(phoneBook[0]);
            } else if (choice == 2) {
                System.out.println(phoneBook[1]);
            } else if (choice == 3) {
                System.out.println(phoneBook[2]);
            } else if (choice == 4) {
                System.out.println(phoneBook[3]);
            } else if (choice == 5) {
                System.out.println(phoneBook[4]);
                for (int k = 0; k < options.length; k++) {
                    System.out.println((k+1) + " " + options[k]);
                }
                System.out.println("0 Back");
                int click = input.nextInt();

                if (click == 1) {
                    System.out.println(options[0]);
                } else if (click == 2) {
                    System.out.println(options[1]);
                } else if (click == 0) {
                    System.out.println("Back to PhoneBook Menu");
                }
            } else if (choice == 0) {
                System.out.println("Back to Main Menu");
            }

        } else if (pick == 2) {
            
            for (int j = 0; j < messages.length; j++) {
                System.out.println((j+1) + " " + messages[j]);
            }
            System.out.println("0 Back");
            int msgChoice = input.nextInt();

            if (msgChoice == 1) {
                System.out.println(messages[0]);
            } else if (msgChoice == 2) {
                System.out.println(messages[1]);
            } else if (msgChoice == 3) {
                System.out.println(messages[2]);
            } else if (msgChoice == 4) {
                System.out.println(messages[3]);
                for (int m = 0; m < messageSettings.length; m++) {
                    System.out.println((m+1) + " " + messageSettings[m]);
                }
                System.out.println("0 Back");
                int setChoice = input.nextInt();

                if (setChoice == 1) {
                    for (int s = 0; s < messageSet1.length; s++) {
                        System.out.println((s+1) + " " + messageSet1[s]);
                    }
                    System.out.println("0 Back");
                    input.nextInt();
                } else if (setChoice == 2) {
                    for (int c = 0; c < messageCommon.length; c++) {
                        System.out.println((c+1) + " " + messageCommon[c]);
                    }
                    System.out.println("0 Back");
                    input.nextInt();
                } else if (setChoice == 0) {
                    System.out.println("Back to Messages Menu");
                }
            } else if (msgChoice == 0) {
                System.out.println("Back to Main Menu");
            }

        } else if (pick == 3) {
            
            System.out.println(menus[2]);
            System.out.println("0 Back");
            input.nextInt();

        } else if (pick == 4) {
            
            for (int j = 0; j < callRegister.length; j++) {
                System.out.println((j+1) + " " + callRegister[j]);
            }
            System.out.println("0 Back");
            int regChoice = input.nextInt();

            if (regChoice == 1) {
                System.out.println(callRegister[0]);
            } else if (regChoice == 2) {
                System.out.println(callRegister[1]);
            } else if (regChoice == 3) {
                System.out.println(callRegister[2]);
            } else if (regChoice == 4) {
                System.out.println(callRegister[3]);
            } else if (regChoice == 5) {
                for (int d = 0; d < callDuration.length; d++) {
                    System.out.println((d+1) + " " + callDuration[d]);
                }
                System.out.println("0 Back");
                input.nextInt();
            } else if (regChoice == 0) {
                System.out.println("Back to Main Menu");
            }

        } else if (pick == 0) {
            System.out.println("Exiting...");
        } else {
            System.out.println("Invalid choice!");
        }

     
    }
}


