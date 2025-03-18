package chaptor2.item4;

/*
    인스턴스화를 막기위해 private 생성자를 사용해라
 */
public class UsePrivateToPreventInstantiation {

    private UsePrivateToPreventInstantiation() {
        throw new IllegalArgumentException("생성자 호출이 불가능합니다.");
    }

    public static void printHello() {
        System.out.println("Hello");
    }

}
