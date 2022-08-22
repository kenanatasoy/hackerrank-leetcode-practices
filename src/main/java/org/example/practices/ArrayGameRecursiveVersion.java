package org.example.practices;

public class ArrayGameRecursiveVersion {

    public boolean canWin(int leap, int[] game) {
        return canBeWonRecursive(leap, game, 0);
    }

    public boolean canBeWonRecursive(int leap, int[] game, int position){

        if(position >= game.length)
            return true;
        else if( position < 0 || game[position] != 0)
            return false;

        game[position] = 1;

        return canBeWonRecursive(leap, game, position + leap) ||
                canBeWonRecursive(leap, game, position + 1) ||
                canBeWonRecursive(leap, game, position - 1);
    }


}
