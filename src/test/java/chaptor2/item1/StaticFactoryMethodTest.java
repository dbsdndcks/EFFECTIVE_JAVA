package chaptor2.item1;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StaticFactoryMethodTest {

    @DisplayName("매개변수가 하나일때 다양한 경우의 정적팩토리메소드 ")
    @Test
    void test(){
        // given
        StaticFactoryMethod staticFactoryMethodAdult = StaticFactoryMethod.createAdult("머랭");
        StaticFactoryMethod staticFactoryMethodChild = StaticFactoryMethod.createChild("머랭");
        int expectedAdult = 18;
        int expectedChild = 10;

        // when & then
        SoftAssertions.assertSoftly(softAssertions -> {
            softAssertions.assertThat(staticFactoryMethodAdult.getAge()).isEqualTo(expectedAdult);
            softAssertions.assertThat(staticFactoryMethodChild.getAge()).isEqualTo(expectedChild);
        });
    }
}
