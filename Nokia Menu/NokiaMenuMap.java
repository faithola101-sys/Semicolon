import java.util.Scanner;

public class NokiaMenuMap {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

String[] menus = {"PHONE BOOK", "MESSAGES", "CHAT", "CALL REGISTER", "TONES","SETTINGS", "CALL DIVERT", "GAMES", "CALCULATOR", "REMINDERS", "CLOCK", "PROFILES", "SIM SERVICES"};

                              String[] phoneBookMenu = {"Search","Service Nos.","Add name","Erase",
                              "Edit","Assign tone","Send b'card","Speed dials","Voice tags","Options"};
                               String[] phoneBookOptions = {"Type of view","Memory status"};

          String[] messagesMenu = {"Write messages","Inbox","Outbox","Picture messages",
          "Templates","Smileys","Message settings","Info service","Voice mailbox number","Service command editor"};
          String[] messagesMessagesettings = {"Set", "Common"}; 
          String[] messageMessagesettingsset = {"Message centre number","Message sent as","Message validity"};            
          String[] messageMessagesettingscommon = {"Delivery reports", "Reply via same centre","Character support"};


String[] callRegisterMenu = {"Missed calls", "Received calls", "Dialled numbers",
        "Erase recent call lists", "Show call duration", "Show call costs", "Call cost settings", "Prepaid credit"};
String[] callRegisterShowCallDuration = {"Last call duration", "All calls' duration", "Receive calls' duration",
               "Dialled calls' duration", "Clear timers"}; 
String[] callRegisterShowCallCosts = {"Last call cost", "All calls' cost", "Clear counters"};
String[] callRegisterCallCostSettings = {"Call cost limit", "Show cost in"};


                            String[] tonesMenu = {"Ringing tone","Ringing volume","Incoming call alert","Composer",
                            "Message alert tone","Warming and game tones","Vibration alert","Screen saver"};

      String[] settingsMenu = {"Call settings","Phone settings","Security settings","Restore factory settings"};
               String[] settingsCallSettings = {"Automatic redial", "Speed dialling", "Call waiting options",
                                            "Own number sending", "Phone line in use", "Automatic answer"};
               String[] settingsPhoneSettings = {"Language", "Cell info display","Welcome note", 
                                          "Network selection", "Lights","Confirm SIM service actions"};
               String[] settingsSecuritySettings = {"PIN code request", "Call barring service",
                             "Fixed dialling","Closed user group","Phone security","Change access codes"};

 String[] clockMenu = {"Alarm clock", "Clock settings", "Date setting","Stopwatch",
                        "Counterdown timer","Auto update of date and time"};

              System.out.println("    NOKIA PHONE MENU"); 
               

              for (int i = 1; i <= menus.length; i++) {
                System.out.println(i + " " + menus[i]);
              }


             System.out.println("      CHOOSE FROM THE MENU ONLY");
             String pick = input.nextLine();

            if (pick.equals("PHONE BOOK")) {
               for (String item : phoneBookMenu) {
               System.out.println(item);}
               }
           else if (pick.equals("MESSAGES")) {
               for (String item : messagesMenu) {
               System.out.println(item);}
               }
           else if (pick.equals("CALL REGISTER")) {
               for (String item : callRegisterMenu) {
               System.out.println(item);}
               }
            else if (pick.equals("TONES")) {
               for (String item : tonesMenu) {
               System.out.println(item);}
               }
            else if (pick.equals("SETTINGS")) {
               for (String item : settingsMenu) {
               System.out.println(item);}
               }
            else if (pick.equals("CLOCK")) {
               for (String item : clockMenu) {
               System.out.println(item);}
               }
            else {
               System.out.print("Invalid choice! Please pick from the list.");
            }



 }
}
