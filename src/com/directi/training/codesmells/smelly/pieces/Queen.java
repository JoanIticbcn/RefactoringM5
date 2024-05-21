package com.directi.training.codesmells.smelly.pieces;

import com.directi.training.codesmells.smelly.Color;
import com.directi.training.codesmells.smelly.Position;
import com.directi.training.codesmells.smelly.chess.MoveUtil;

public class Queen extends Piece
{
    public Queen(Color color)
    {
        super(color);
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString()
    {
        return "q";
    }


    @Override
    public boolean isValidMove(Position from, Position to) {
        return MoveUtil.isStraightLineMove(from, to);
    }
}
