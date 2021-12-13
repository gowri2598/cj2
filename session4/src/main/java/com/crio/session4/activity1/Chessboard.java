package com.crio.session4.activity1;

public class Chessboard {
    ChessboardHouse[][] board = new ChessboardHouse[8][8];
}

class ChessboardHouse {
    ChessObject object;

    public ChessboardHouse[][] findPossibleMoves() {
        if(object.getType() == ChessObjectType.PAWN) {
            System.out.println("Applying rules for Pawn");
        }
        if(object.getType() == ChessObjectType.QUEEN) {
            System.out.println("Applying rules for Queen");
        }
        return null;
    }
}


enum ChessObjectType {
    PAWN,
    QUEEN
}

interface ChessObject {
    ChessObjectType getType();
}

class Pawn implements ChessObject{
    private ChessObjectType type = ChessObjectType.PAWN;

    @Override
    public ChessObjectType getType() {
        return type;
    }
}

class Queen implements ChessObject{
    private ChessObjectType type = ChessObjectType.QUEEN;

    @Override
    public ChessObjectType getType() {
        return type;
    }

}
