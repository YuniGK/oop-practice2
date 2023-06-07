import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class CourseTest {
    @DisplayName("과목(코스) 생성")
    @Test
    void createTest(){
        assertThatCode(()-> new Course("OOP", 3, "A+"))//과목을 생성
                .doesNotThrowAnyException();//생성이 정상적으로 이뤄지면 오류가 발생하지 않는다.
    }
}
