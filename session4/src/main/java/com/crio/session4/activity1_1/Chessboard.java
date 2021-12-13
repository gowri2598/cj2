package com.crio.session4.activity1_1;


public class Chessboard {
    ChessboardHouse[][] board = new ChessboardHouse[8][8];
}

class ChessboardHouse {
    ChessObject object;
    Chessboard board;
    public ChessboardHouse[][] findPossibleMoves() {
        return object.getMoveStrategy().findPossibleMoves(board.board);
    }
}


enum ChessObjectType {
    PAWN,
    QUEEN
}

interface ChessObject {
    ChessObjectType getType();
    MoveStrategy getMoveStrategy();
}

abstract class AbstractChessObject implements ChessObject{
    private ChessObjectType type = ChessObjectType.PAWN;
    private MoveStrategy moveStrategy;

    public AbstractChessObject(ChessObjectType type, MoveStrategy moveStrategy) {
        this.type = type;
        this.moveStrategy = moveStrategy;
    }

    @Override
    public ChessObjectType getType() {
        return type;
    }

    @Override
    public MoveStrategy getMoveStrategy() {
        return this.moveStrategy;
    }
    
    public void setMoveStrategy(MoveStrategy strategy) {
        this.moveStrategy = strategy;
    }
}

class Pawn extends AbstractChessObject {

    public Pawn() {
        super(ChessObjectType.PAWN, new PawnMoveStrategy());
    }
}

class Queen extends AbstractChessObject {

    public Queen() {
        super(ChessObjectType.QUEEN, new QueenMoveStrategy());
    }
}

interface MoveStrategy {
    ChessboardHouse[][] findPossibleMoves(ChessboardHouse[][] houseArray);
}

class PawnMoveStrategy implements MoveStrategy {
    @Override
    public ChessboardHouse[][] findPossibleMoves(ChessboardHouse[][] houseArray) {
        System.out.println("Applying rules for Pawn");
        return houseArray;
    }
}


class QueenMoveStrategy implements MoveStrategy {
    @Override
    public ChessboardHouse[][] findPossibleMoves(ChessboardHouse[][] houseArray) {
        System.out.println("Applying rules for Queen");
        return houseArray;
    }
}

