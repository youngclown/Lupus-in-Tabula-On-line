package lupus.in.tabula.online.constants;

// enum 연습 겸 처리하려고했는데, 기능상 여러가지 변경점 발생할 수 있으니 enum 처리가 안됨.
@Deprecated
public enum WhenConstants {
    ONE_TYPE("낮"),
    TWO_TYPE("밤"),
    THREE_TYPE("언제든");

    final private String name;

    WhenConstants(String name) { //enum에서 생성자 같은 역할
        this.name = name;
    }
    public String getName() { // 문자를 받아오는 함수
        return name;
    }

    public static void main(String[] args) {
        for(WhenConstants type : WhenConstants.values()) {
            System.out.println(type.getName());
        }
    }

//    static long NIGHT = 0;      // 밤에
//    static long MORNING = 1;    // 낮에
//    static long ANYTIME = 2;    // 언제든
}
