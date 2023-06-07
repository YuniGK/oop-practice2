import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/*
* 요구사항
* 평균학점 계산 방법 = (학점수 * 교과목 평점) 합계 / 수강신청 총학점 수
* 일급 컬렉션 사용
*/
public class GradeCalculatorTest {
    /*
    * 학점 계산기 도메인 : 이수한 과목, 학점 계산기
    * 과목(코스) 클래스
    *
    * 이수한 과목을 전탈 평균학점 계산 요청 ⇢ 학점 계산기
    */

    @DisplayName("평균 학점을 계산")
    @Test
    void calculateGradeTest(){
        //과목 생성
        List<Course> courses = List.of(
                new Course("OOP", 3, "A+")
                , new Course("자료구조", 3, "A+")
        );

        //학점 계산
        GradeCalculator gradeCalculator = new GradeCalculator(courses);
        double gradeResult = gradeCalculator.calculateGrade();

        assertThat(gradeResult).isEqualTo(4.5);
    }
}
