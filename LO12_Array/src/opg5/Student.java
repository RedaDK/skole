package opg5;

public class Student {
		private String name;
		private int[] grades;// containing the student's grades
		private int gradeCount;// the current number of grades

		private static final int MAX_GRADE_COUNT = 10;// maximum number of grades

		public Student(String name) {
				this.name = name;
				this.grades = new int[Student.MAX_GRADE_COUNT];
				this.gradeCount = 0;
		}

		public String getName() {
				return this.name;
		}

		public int[] getGrades() {
				return this.grades;
		}

		public int getGradeCount() {

				return this.gradeCount;
		}

		// Tilføjer karakter til Student klasse
		public void addGrade(int grade) {
				if (gradeCount < MAX_GRADE_COUNT) {
						grades[gradeCount] = grade;
						gradeCount++;
				}
		}

		// Tager gennemsnittet af alle karakter fra Student klasse
		public double gradeAverage() {
				int sum = 0;
				for (int i = 0; i < gradeCount; i++) {
						sum += grades[i];
				}
				return (double) sum / gradeCount;
		}

		public int[] getActualGrades() {
				int[] actual = new int[gradeCount];
				for (int i = 0; i < actual.length; i++) {
						actual[i] = grades[i];
				}
				return actual;
		}

}
