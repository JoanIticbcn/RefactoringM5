package com.directi.training.codesmells.smelly.pieces;

import com.directi.training.codesmells.smelly.Color;

public abstract class Knight extends Piece
{
    public Knight(Color color)
    {
        super(color, 'k');
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString()
    {
        return "k";
    }
}
