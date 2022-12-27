package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.*;

public class RacingCarTest {

    @Test
    @DisplayName("자동차의 이름을 부여한다.")
    void giveACarName() {
        String carName = "avante";
        Car car = new Car(carName);

        assertThat(car.isSameName(carName)).isTrue();
    }

    @Test
    @DisplayName("0에서 9 사이에서 random값을 구한다.")
    void generateRandomNumber() {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        assertThat(randomNumberGenerator.generateBetweenZeroAndNine())
                .isGreaterThanOrEqualTo(0)
                .isLessThan(10);
    }

}
