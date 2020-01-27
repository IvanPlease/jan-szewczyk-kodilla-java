package com.kodilla.rps;

public class RPSRules implements Rules{

    @Override
    public int whoWin(int move1, int move2) {
        Moves.Move mv1 = Moves.Move.values()[move1-1];
        Moves.Move mv2 = Moves.Move.values()[move2-1];
        int result = 0;
        switch(mv1){
            case KAMIEN:
                if(mv2 == Moves.Move.PAPIER){
                    result = 2;
                }else if(mv2 == Moves.Move.NOZYCZKI){
                    result = 1;
                }
                break;
            case PAPIER:
                if(mv2 == Moves.Move.NOZYCZKI){
                    result = 2;
                }else if(mv2 == Moves.Move.KAMIEN){
                    result = 1;
                }
                break;
            case NOZYCZKI:
                if(mv2 == Moves.Move.KAMIEN){
                    result = 2;
                }else if(mv2 == Moves.Move.PAPIER){
                    result = 1;
                }
                break;
        }
        return result;
    }
}
