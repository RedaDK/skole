package pigs;

import java.util.Random;

public class Die {
	// number of faces
	private int faceCount;
	// value of upper face
	private int faceValue;
	// generates random numbers
	private Random generator;

	/**
	 * Creates a die with the given face count and a random face value.
	 */
	public Die(int faceCount) {
		// TODO
		this.faceCount = faceCount;
		generator = new Random();

	}

	/**
	 * Creates a die with 6 faces and a random face value.
	 */
	public Die() {
		this.faceCount = 0;
		generator = new Random();
	}

	public void Face(int faceValue) {
		this.faceValue = faceValue;
	}

	public int getFaceValue() {
		return faceValue;
	}

	/**
	 * Rolls the die, resulting in a new face value.
	 */
	public void roll() {
		this.faceValue = 1 + generator.nextInt(faceCount);
	}

	public int getFaceCount() {
		return faceCount;
	}
}
