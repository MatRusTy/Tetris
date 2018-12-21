import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public abstract class Tetrimino implements KeyListener {
    protected int orientation;
    private Color color;
    protected ArrayList<GridElement> pieces; //position of the 4 pieces
    protected ArrayList<GridElement> bottomPieces; // position of the pieces, that face down.

    public Tetrimino(Color c){
        orientation = 0;
        color = c;
        pieces = new ArrayList<>();
        calculateBottomPieces();
    }

    public abstract void rotateClockwise();

    public abstract void rotateCounterClockwise();

    public abstract void calculateBottomPieces();

    /**
     * Moves the tetrimino one unit to the left
     */
    public void moveLeft(){
        int indexOfRightermostBlock = Math.min(Math.min(pieces.get(0).x(),pieces.get(1).x()),Math.min(pieces.get(2).x(),pieces.get(3).x()));
        if(indexOfRightermostBlock != 0){
            for(GridElement i : pieces){
                i.setX(i.x()-1);
            }
        }
    }

    /**
     * Moves the tetrimino one unit to the right
     */
    public void moveRight(){
        int indexOfRightermostBlock = Math.max(Math.max(pieces.get(0).x(),pieces.get(1).x()),Math.max(pieces.get(2).x(),pieces.get(3).x()));
        if(indexOfRightermostBlock != 9){
            for(GridElement i : pieces){
                i.setX(i.x()+1);
            }
        }
    }


    public void moveDown(){

        for(GridElement i : pieces){
            i.setY(i.y()-1);

        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //Won't be implemented
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){

            case KeyEvent.VK_UP : {
                //ROTATE
            }
            case KeyEvent.VK_DOWN : {
                //ROTATE
            }
            case KeyEvent.VK_LEFT : {
                moveLeft();
            }
            case KeyEvent.VK_RIGHT : {
                moveRight();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //Won't be implemented
    }


    public ArrayList<GridElement> getBottomPieces(){
        return bottomPieces;
    }

    public ArrayList<GridElement> getPieces() {
        return pieces;
    }
}