import java.util.List;

public class Courses {
    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multipliedCteditAndCourseGrade() {
        double multipliedCteditAndCourseGrade = 0;

        for (Course course : courses){
            //학점 * 성적을 숫자로 변경
            //multipliedCteditAndCourseGrade += course.getCredit() * course.getGradeToNumber(); //다른 곳에서 사용할 경우 문제가 발생 할 수 있다. 응집도가 낮다.
            multipliedCteditAndCourseGrade += course.multiplyCreditAndCourseGrade();//계산을 course에 넘겨 응집도를 높힌다.
        }
        return multipliedCteditAndCourseGrade;
    }

    public int calculateTotalCompletedCredit() {
        int totalCompletedCredit = courses.stream()
                .mapToInt(Course :: getCredit)
                .sum();

        return totalCompletedCredit;
    }
}
