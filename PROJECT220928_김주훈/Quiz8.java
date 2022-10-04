package PROJECT220928_김주훈;

import java.util.Scanner;

class Phone {
    private String name;
    private String tel;
    Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;

    }

    public String getName() {
        return name;
    }
    public String getTel() {
        return tel;
    }
}
public class Quiz8 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("인원수>>");
        num = sc.nextInt();
        Phone phone[] = new Phone[num];
        for(int i=0; i<num; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            String str1, str2;
            str1 = sc.next();
            str2 = sc.next();
            phone[i] = new Phone(str1, str2);
        }
        System.out.println("저장되었습니다...");
        boolean state = false;
        String name = "";
        while(true) {
            System.out.print("검색할 이름>>");
            name = sc.next();
            if(name.equals("그만")) {
                break;

            }
            for(int i=0; i<num; i++) {
                if(name.equals(phone[i].getName())) {
                    System.out.println(name + "의 번호는 " + phone[i].getTel());
                    state = true;
                }
            }

            if(state == false) {
                System.out.println(name + "이 없습니다.");
            }
        }
        sc.close();
    }
}

