package opg6;

public class Child<weight> {
		private int age;
		private boolean male;
		private double[] weight = new double[10];

		public Child(int age, boolean male) {
				this.age = age;
				this.male = male;
		}

		public int getAge() {
				return age;
		}

		public void setAge(int age) {
				this.age = age;
		}

		public boolean isMale() {
				return male;
		}

		public void setMale(boolean male) {
				this.male = male;
		}

		public String institution() {
				// TODO
				return null;
		}

		public double[] getWeight(double[] t) {

				return this.weight;
		}

}
