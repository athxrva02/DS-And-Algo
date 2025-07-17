package dsajava;

public class ZigZagConversion {
    private char[][] fillZigzag(char[] arr, int numRows) {
        int n = arr.length;
        char[][] zigzag = new char[numRows][n];
        for(char[] row : zigzag) java.util.Arrays.fill(row, '\0');
        int i = 0;
        int row = 0;
        int col = 0;

        while (i < n) {
            // Downward
            while (row < numRows && i < n) {
                zigzag[row][col] = arr[i++];
                row++;
            }
            row -= 2;
            col++;

            // Diagonal Up
            while (row > 0 && i < n) {
                zigzag[row][col] = arr[i++];
                row--;
                col++;
            }
        }
        return zigzag;
    }

    private String collectZigzag(char[][] zigzag, int numRows, int length) {
        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < length; c++) {
                if (zigzag[r][c] != '\0') {
                    sb.append(zigzag[r][c]);
                }
            }
        }
        return sb.toString();
    }

    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;
        char[][] zigzag = fillZigzag(s.toCharArray(), numRows);
        return collectZigzag(zigzag, numRows, s.length());
    }

    public static void main(String[] args) {
        ZigZagConversion zc = new ZigZagConversion();
        System.out.println(zc.convert("PAYPALISHIRING", 3));
        System.out.println(zc.convert("PAYPALISHIRING", 4));
    }
}
