import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.javaqa.BonusService;

public class BonusServiceTest {

    @ParameterizedTest()
    @CsvFileSource(files = "src/test/resources/data.csv")
    void shouldCalculateBonus (int expected, int amount, boolean isRegistered) {
        BonusService service = new BonusService();
        long actual = service.calculate(amount, isRegistered);
        Assertions.assertEquals(expected, actual);
    }
}
