package PROJECT220928_김주훈;

import java.util.Scanner;
class Dictionary {
	private static String [] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String [] eng = { "love", "baby", "money", "future", "hope" };
	
    public static String kor2Eng(String word) {
        for(int i=0; i<kor.length; i++) {
            if(word.equals(kor[i])) {
                return eng[i];
            }
        }
        return null;
        
    }
}

public class Quiz10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dictionary dict = new Dictionary();
        String str = "";
        System.out.println("한영 단어 검색 프로그램입니다.");
        while(true) {
            System.out.print("한글 단어?");
            str = sc.next();
            if(str.equals("그만"))
                break;
            String result = dict.kor2Eng(str);
            if(result == null) {
                System.out.println(str + "은(는) 저의 사전에 없습니다.");
            }
            else {
                System.out.println(str + "은(는) " + result);
            }
        }
        sc.close();
        

    }
}
