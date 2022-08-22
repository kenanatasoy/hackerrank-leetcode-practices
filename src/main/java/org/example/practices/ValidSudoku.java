package org.example.practices;

import java.util.ArrayList;

class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {

        return isValidByRows(board) && isValidByColumns(board) && isValidByLocalBoxes(board);

    }


    boolean isValidByRows(char[][] board){

        for (int i = 0; i < 9; i++) {

            ArrayList<Character> arrayList = new ArrayList<>();

            for (int j = 0; j < 9; j++) {

                if (arrayList.contains(board[i][j]))
                    return false;

                if (board[i][j] != '.')
                    arrayList.add(board[i][j]);

            }

        }

        return true;

    }


    boolean isValidByColumns(char[][] board){

        for (int i = 0; i < 9; i++) {

            ArrayList<Character> arrayList = new ArrayList<>();

            for (int j = 0; j < 9; j++) {

                if (arrayList.contains(board[j][i]))
                    return false;

                if (board[j][i] != '.')
                    arrayList.add(board[j][i]);

            }

        }

        return true;
    }


    boolean isValidByLocalBoxes(char[][] board){

        for (int i = 0; i < 9; i = i + 3) {

            for (int j = 0; j < 9; j = j + 3) {

                int localBoxRow = i % 3;
                int localBoxColumn = j % 3;

                ArrayList<Character> arrayList = new ArrayList<>();

                for (int a = localBoxRow; a < localBoxRow + 3; a++) {

                    for (int b = localBoxColumn; b < localBoxColumn + 3; b++) {

                        if (arrayList.contains(board[a][b]))
                            return false;

                        if (board[a][b] != '.')
                            arrayList.add(board[a][b]);

                    }

                }

            }

        }

        return true;

    }


}
