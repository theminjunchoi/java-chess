package chess.view;

import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    public String readStartPosition() {
        System.out.println("움직일 기물의 위치를 입력해주세요. (row, column)");
        return scanner.nextLine();
    }

    public String readEndPosition() {
        System.out.println("도착할 위치를 입력해주세요. (row, column)");
        return scanner.nextLine();
    }
}
