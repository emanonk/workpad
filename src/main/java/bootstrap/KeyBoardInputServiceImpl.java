package bootstrap;

import java.util.Scanner;

public class KeyBoardInputServiceImpl implements KeyBoardInputService{

    public String readKeyboardCommand() {
        Scanner scan = new Scanner(System.in);

        if(scan.hasNextLine()){
            return scan.nextLine();
            //...
        }
        return "wait";
    }
}
