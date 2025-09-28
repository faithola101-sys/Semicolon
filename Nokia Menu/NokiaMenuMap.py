
# NokiaMenuMap.py

menus = ["PHONE BOOK", "MESSAGES", "CHAT", "CALL REGISTER", "TONES", "SETTINGS",
         "CALL DIVERT", "GAMES", "CALCULATOR", "REMINDERS", "CLOCK", "PROFILES", "SIM SERVICES"]

phoneBookMenu = ["Search", "Service Nos.", "Add name", "Erase",
                 "Edit", "Assign tone", "Send b'card", "Speed dials", "Voice tags", "Options"]
phoneBookOptions = ["Type of view", "Memory status"]

messagesMenu = ["Write messages", "Inbox", "Outbox", "Picture messages",
                "Templates", "Smileys", "Message settings", "Info service",
                "Voice mailbox number", "Service command editor"]
messagesMessagesettings = ["Set", "Common"]
messageMessagesettingsset = ["Message centre number", "Message sent as", "Message validity"]
messageMessagesettingscommon = ["Delivery reports", "Reply via same centre", "Character support"]

callRegisterMenu = ["Missed calls", "Received calls", "Dialled numbers",
                    "Erase recent call lists", "Show call duration", "Show call costs",
                    "Call cost settings", "Prepaid credit"]
callRegisterShowCallDuration = ["Last call duration", "All calls' duration",
                                "Receive calls' duration", "Dialled calls' duration", "Clear timers"]
callRegisterShowCallCosts = ["Last call cost", "All calls' cost", "Clear counters"]
callRegisterCallCostSettings = ["Call cost limit", "Show cost in"]

tonesMenu = ["Ringing tone", "Ringing volume", "Incoming call alert", "Composer",
             "Message alert tone", "Warming and game tones", "Vibration alert", "Screen saver"]

settingsMenu = ["Call settings", "Phone settings", "Security settings", "Restore factory settings"]
settingsCallSettings = ["Automatic redial", "Speed dialling", "Call waiting options",
                        "Own number sending", "Phone line in use", "Automatic answer"]
settingsPhoneSettings = ["Language", "Cell info display", "Welcome note",
                         "Network selection", "Lights", "Confirm SIM service actions"]
settingsSecuritySettings = ["PIN code request", "Call barring service",
                            "Fixed dialling", "Closed user group", "Phone security", "Change access codes"]

clockMenu = ["Alarm clock", "Clock settings", "Date setting", "Stopwatch",
             "Counterdown timer", "Auto update of date and time"]

print("    NOKIA PHONE MENU")

for i in range(len(menus)):
    print(f"{i+1} {menus[i]}")

pick = input("      CHOOSE FROM THE MENU ONLY: ")

if pick == "1":
    for item in phoneBookMenu:
        print(item)
elif pick == "2":
    for item in messagesMenu:
        print(item)
elif pick == "3":
    print("CHAT")
elif pick == "4":
    for item in callRegisterMenu:
        print(item)
elif pick == "5":
    for item in tonesMenu:
        print(item)
elif pick == "6":
    for item in settingsMenu:
        print(item)
elif pick == "7":
    print("CALL DIVERT")
elif pick == "8":
    print("GAMES")
elif pick == "9":
    print("CALCULATOR")
elif pick == "10":
    print("REMINDERS")
elif pick == "11":
    for item in clockMenu:
        print(item)
else:
    print("invalid")
