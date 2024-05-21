package com.directi.training.codesmells.smelly.pieces;

import com.directi.training.codesmells.smelly.Color;
import com.directi.training.codesmells.smelly.Position;

public abstract class Piece
{
    private Color _color;
    

    public Piece(Color color)
    {
        _color = color;
    }

    
    /** 
     * @return Color
     */
    public Color getColor()
    {
        return _color;
    }

    public abstract boolean isValidMove(Position from, Position to);
}
