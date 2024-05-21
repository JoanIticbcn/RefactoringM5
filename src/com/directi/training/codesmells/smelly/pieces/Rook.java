package com.directi.training.codesmells.smelly.pieces;

import com.directi.training.codesmells.smelly.Position;
import com.directi.training.codesmells.smelly.chess.MoveUtil;
import com.directi.training.codesmells.smelly.Color;

public class Rook extends Piece
{
    public Rook(Color color)
    {
        super(color);
    }

    public boolean isValidMove(Position from, Position to)
    {
        return MoveUtil.isHorizontalOrVerticalMove(from, to);
    }
    /** 
     * @return String
     */
    @Override
    public String toString()
    {
        return "r";
    }
}
