public class Tic {
    String[][] board;
    int rows;
    int cols;
    String turn;

    public Tic(int rows, int cols) {
        board = new String[rows][cols];
        this.rows = rows;
        this.cols = cols;
        turn = "X";

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
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

        // Size
        if (!(rows == other.rows && cols == other.cols))
            return false;

        // Turn
        if (!(turn.equals(other.turn)))
            return false;

        // Contents
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!(board[i][j].equals(other.board[i][j])))
                    return false;
            }
        }

        return true;
    }
}
