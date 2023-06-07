import java.util.List;

public class GradeCalculator {
    private final List<Course> courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = courses;
    }

    public double calculateGrade(){
        double multipliedCteditAndCourseGrade = 0;
        
        for (Course course : courses){
            //학점 * 성적을 숫자로 변경
            multipliedCteditAndCourseGrade += course.getCredit() * course.getGradeToNumber();
        }

        //수강신청 총학점 수
        int totalCompletedCredit = courses.stream()
                .mapToInt(Course :: getCredit)
                .sum();

        return multipliedCteditAndCourseGrade / totalCompletedCredit;
    }
}