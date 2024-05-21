package com.directi.training.codesmells.smelly.pieces;

import com.directi.training.codesmells.smelly.Color;

public class Queen extends Piece
{
    public Queen(Color color)
    {
        super(color, 'q');
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString()
    {
        return "q";
    }
}
