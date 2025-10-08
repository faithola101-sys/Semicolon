
    print("           NOKIA 3310 PHONE MENU")

    menus = ["PhoneBook", "Messages", "Chat", "Call register"]
    phoneBook = ["Search", "Service Nos.", "Add name", "Erase", "Options"]
    options = ["Type of view", "Memory status"]
    messages = ["Write message", "Inbox", "Outbox", "Message settings"]
    messageSettings = ["Set 1", "Common"]
    messageSet1 = ["Message centre number", "Message sent as", "Message validity"]
    messageCommon = ["Delivery reports", "Reply via same centre", "Character support"]
    callRegister = ["Missed calls", "Received calls", "Dialled numbers", "Erase recent call lists", "Show call duration"]
    callDuration = ["Last call duration", "All calls' duration", "Received calls' duration", "Dialled calls' duration", "Clear timers"]

   
    for i in range(len(menus)):
        print(f"{i+1} {menus[i]}")
    print("0 Exit")

    pick = int(input("Pick Menu (0-4): "))

    if pick == 1:  # PhoneBook
        for j in range(len(phoneBook)):
            print(f"{j+1} {phoneBook[j]}")
        print("0 Back")

        choice = int(input("Choice (0-5): "))

        if choice in range(1, 6):
            print(phoneBook[choice-1])

            if choice == 5:  # Options
                for k in range(len(options)):
                    print(f"{k+1} {options[k]}")
                print("0 Back")

                click = int(input("Click (0-2): "))
                if click in (1, 2):
                    print(options[click-1])
                elif click == 0:
                    print("Back to PhoneBook Menu")
        elif choice == 0:
            print("Back to Main Menu")

    elif pick == 2:  # Messages
        for j in range(len(messages)):
            print(f"{j+1} {messages[j]}")
        print("0 Back")

        msgChoice = int(input("Choice (0-4): "))

        if msgChoice == 4:  # Message settings
            for m in range(len(messageSettings)):
                print(f"{m+1} {messageSettings[m]}")
            print("0 Back")

            setChoice = int(input("Choice (0-2): "))
            if setChoice == 1:
                for s in range(len(messageSet1)):
                    print(f"{s+1} {messageSet1[s]}")
            elif setChoice == 2:
                for c in range(len(messageCommon)):
                    print(f"{c+1} {messageCommon[c]}")
            elif setChoice == 0:
                print("Back to Messages Menu")
        elif msgChoice in (1, 2, 3):
            print(messages[msgChoice-1])
        elif msgChoice == 0:
            print("Back to Main Menu")

    elif pick == 3:  # Chat
        print(menus[2])
        print("0 Back")
        input()

    elif pick == 4:  # Call register
        for j in range(len(callRegister)):
            print(f"{j+1} {callRegister[j]}")
        print("0 Back")

        regChoice = int(input("Choice (0-5): "))

        if regChoice in range(1, 5):
            print(callRegister[regChoice-1])
        elif regChoice == 5:  # Show call duration
            for d in range(len(callDuration)):
                print(f"{d+1} {callDuration[d]}")
            print("0 Back")
            input()
        elif regChoice == 0:
            print("Back to Main Menu")

    elif pick == 0:
        print("Exiting...")

    else:
        print("Invalid choice!")




