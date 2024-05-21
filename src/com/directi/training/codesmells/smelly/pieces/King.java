package com.directi.training.codesmells.smelly.pieces;

import com.directi.training.codesmells.smelly.Color;

public class King extends Piece
{
    public King(Color color)
    {
        super(color, 'K');
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString()
    {
        return "K";
    }
}
