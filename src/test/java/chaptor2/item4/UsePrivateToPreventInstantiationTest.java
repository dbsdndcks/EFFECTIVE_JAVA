package chaptor2.item4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*
    인스턴스화를 막기위해 private 생성자를 사용해라
 */
public class UsePrivateToPreventInstantiationTest {

    /*
    이와 같이 생성이 아예 되지 않는다.

    @DisplayName("private 생성자를 통해 접근하면 예외가 터진다")
    @Test
    void test() {
        Assertions.assertThat(new UsePrivateToPreventInstantiation()).isInstanceOf(IllegalArgumentException.class);
    }
    */

}
