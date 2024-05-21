package com.directi.training.codesmells.smelly.pieces;

import com.directi.training.codesmells.smelly.Color;
import com.directi.training.codesmells.smelly.Position;

public  class Knight extends Piece
{
    public Knight(Color color)
    {
        super(color);
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString()
    {
        return "k";
    }


    @Override
    public boolean isValidMove(Position from, Position to) {
        int columnDiff = Math.abs(to.getColumn() - from.getColumn());
        int rowDiff = Math.abs(to.getRow() - from.getRow());
        return (columnDiff == 2 && rowDiff == 1) || (columnDiff == 1 && rowDiff == 2);
    }
}
