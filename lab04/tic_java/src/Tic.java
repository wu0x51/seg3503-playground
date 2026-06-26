public class Tic {
    String[][] board;
    int rows;
    int cols;
    String turn;

    public Tic(int row, int col) {
        board = new String[row][col];
        rows = row;
        cols = col;
        turn = "X";
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                board[i][j] = "_";
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        // Standard checks
        if (this == o)
            return true;
        if (!(o instanceof Tic other))
            return false;

        if (!(rows == other.rows && cols == other.cols))
            return false;

        return true;
    }
}
