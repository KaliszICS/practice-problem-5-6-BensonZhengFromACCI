public class PracticeProblem {

	public static void main(String args[]) {
	}

	public static int getAge(String[] names, int[] ages, String name) {
		int age = 0;
		for (int start = 0; start < names.length; start++) {
			if (name.equals(names[start])) {
			return ages[start];
			}
		}
	return 0;
	}

	public static int[] createLengthArray(String[] input) {
		int[] numArr = new int[input.length];
		for (int start = 0; start < input.length; start++) { 
			numArr[start] = input[start].length();
		}
		return numArr;
	}

	public static void swapPeople(String[] names, int[] ages, String name, String name2) {
		int first = -1;
		int second = -1;

		for (int start = 0; start < names.length; start++) {
			if (first == -1 && names[start].equals(name)) {
				first = start;
			}
			else if (second == -1 && names[start].equals(name2)) {
				second = start;
			}
		}

		String tempName = names[first];
		names[first] = names[second];
		names[second] = tempName;

		int tempAge = ages[first];
		ages[first] = ages[second];
		ages[second] = tempAge;
	}
}
