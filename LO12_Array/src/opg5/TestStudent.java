package opg5;

public class TestStudent {

		public static void main(String[] args) {
				Student s1 = new Student("Hanne");
				s1.addGrade(10);
				s1.addGrade(1);
				s1.addGrade(3);
				s1.addGrade(14);
				System.out.println(s1.getGradeCount());
				System.out.println(s1.gradeAverage());
				System.out.println(s1.getGrades());
				System.out.println(s1.getActualGrades());
				// System.out.println("Student : " + s1.getName() + " Kararkter : " +
				// s1.getGrades());

		}
}
