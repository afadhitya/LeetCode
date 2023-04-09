package plusone;

public class PlusOneSolution {

    public int[] plusOne(int[] digits) {
        Long before = arrToInt(digits);
        Long after = before + 1;

        return intToArr(after);
    }

    private Long arrToInt(int[] arrInt) {
        StringBuilder sb = new StringBuilder();
        for (int digit : arrInt) {
            sb.append(digit);
        }

        return Long.valueOf(sb.toString());
    }

    private int[] intToArr(Long numb) {
        String numbStr = String.valueOf(numb);
        char[] chars = numbStr.toCharArray();
        int[] numbIntArr = new int[chars.length];

        int idx = 0;
        for (char numbChar : chars) {
            int numbInt = Integer.parseInt(String.valueOf(numbChar));
            numbIntArr[idx] = numbInt;
            idx++;
        }

        return numbIntArr;
    }
}
