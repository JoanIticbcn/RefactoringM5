package com.directi.training.codesmells.refactored.pieces;

import com.directi.training.codesmells.refactored.Color;
import com.directi.training.codesmells.refactored.chess.MoveUtil;
import com.directi.training.codesmells.refactored.Position;

public class Queen extends Piece
{
    public Queen(Color color)
    {
        super(color);
    }

    
    /** 
     * @param from
     * @param to
     * @return boolean
     */
    public boolean isValidMove(Position from, Position to)
    {
        return MoveUtil.isStraightLineMove(from, to);
    }

    @Override
    public String toString()
    {
        return "q";
    }
}
