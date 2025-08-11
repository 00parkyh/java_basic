package assignment.String.num3;

public class FindCharacters {

	public static void main(String[] args) {
		FindCharacters fc = new FindCharacters();
		int count = fc.countChar("Boys, be ambitious", 'b');
		System.out.println(count);

	}
	public int countChar(String str, char c) {
		// Method를 완성하세요...
        int i = 0;
        for (int s = 0; s<str.length();s++) {
            if (str.charAt(s) == c) {
                i++;
            }
        }
        return i;
    }
}
