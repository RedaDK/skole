package opg3;

public class ArrayTest {

		// Metode til at l�gge to lige store Array's sammen
		public int[] sumArrays(int[] a, int[] b) {

				int[] sum = new int[a.length];
				for (int i = 0; i < a.length; i++) {
						sum[i] = a[i] + b[i];

				}
				return sum;
		}

		// Metode til at l�gge 2 Array's sammen afh�ngig af deres l�ngde
//OBS! Virker muligvis ikke...
		public int[] unequal(int[] c, int[] d) {

				int[] sum = null;
				if (c.length < d.length) {
						sum = new int[c.length];
						for (int i = 0; i < d.length; i++) {

								// if(a.lenght > i)
								c[i] += d[i];

								sum[i] = c[i] + d[i];

						}
				} else if (c.length > d.length) {
						sum = new int[d.length];
						for (int j = 0; j < c.length; j++) {

								sum[j] = d[j] + c[j];

						}

				}
				return sum;
		}
}
