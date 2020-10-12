class Solution {
    public int numJewelsInStones(String J, String S) {
        char[] stoneChar = new char[S.length()];
		char[] jewelsChar = new char[J.length()];
         stoneChar=S.toCharArray();
         jewelsChar = J.toCharArray();
		int stoneLength = stoneChar.length;
		int jewelsLength = jewelsChar.length;
		int count = 0;
		for (int i = 0; i < stoneLength; i++) {
			for (int j = 0; j < jewelsLength; j++) {
				if (stoneChar[i] == jewelsChar[j]) {
					
					count++;
				}
			}
		}

		return count;
    }
}
