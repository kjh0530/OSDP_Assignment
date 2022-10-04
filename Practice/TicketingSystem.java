package Practice;

import java.util.Scanner;

class Seat {
    private String name;
    private String seats[] = {"___", "___", "___", "___", "___", "___", "___", "___", "___", "___"};
    public void PrintSeat() {
        for(int i=0; i<seats.length; i++) {
            System.out.print(name + ">>" );
            System.out.print(seats[i] + " ");
        }
    }
}

public class TicketingSystem {
    public static void main(String[] args) {
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        Scanner sc = new Scanner(System.in);
        int menu;
        Seat s[] = new Seat[3];
        while(true) {
            PrintMenu();
            menu = sc.nextInt();
            if(menu == 1) {
                
            }
        }
    }
    public void run() {
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        

    }
    public static void PrintSeat() {

    }
    public static void PrintMenu() {
        System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
    }
}