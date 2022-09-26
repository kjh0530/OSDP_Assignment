//예제 2-9

public class BitOperator {
    public static void main(String[] args) {
        short a = (short)0x55ff;
        short b = (short)0x00ff;

        System.out.println("[비트 연산 결과]");
        System.out.printf("%04x\n", (short)(a & b)); //비트 and
        System.out.printf("%04x\n", (short)(a | b)); //비트 or
        System.out.printf("%04x\n", (short)(a ^ b)); //비트 xor
        System.out.printf("%04x\n", (short)(~a)); //비트 not

        byte c = 20;
        byte d = -8;

        System.out.println("[시프트 연산 결과]");
        System.out.println(c << 2); //c를 왼쪽으로 2비트 시프트
        System.out.println(c >> 2); //c를 오른쪽으로 2비트 시프트
        System.out.println(d >> 2); //default는 산술 시프트로 계산, 1 삽입
        System.out.printf("%x\n", (d >>> 2));
        // >>> 로 쓰면 논술 시프트로 계산, 0 삽입
        
    }
    
}
