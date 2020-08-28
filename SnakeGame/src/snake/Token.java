/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Enzo
 */
public class Token {
    private int x, y, score;
    private Snake snake;
    
    public Token(Snake s) {
        x = (int)(Math.random() * 395);
        y = (int)(Math.random() * 395);
        snake = s;
    }
    
    public void changePosition() {
        x = (int)(Math.random() * 395);
        y = (int)(Math.random() * 395);
    }
    
    public int getScore() {
        return score;
    }
    
    public void dra(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(x, y, 6, 6);
    }
    
    public boolean snakeCollision() {
        int snakeX = snake.getX() + 2;
        int snakeY = snake.getY() + 2;
        if (snakeX >= x-1 && snakeX <= (x + 7)) 
            if (snakeY >= y-1 && snakeY <= (y + 7)) {
                changePosition();
                score++;
                snake.setElongate(true);
                return true;
            }
        return false;
    }
    
}
