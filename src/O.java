import java.awt.*;

public class O extends  Tetrimino{

    public O(PlayingField p){
        super(Color.YELLOW, p);
        //CHANGE ALL Y-X IN ALL PIECES CLASSES
        pieces.add(new GridElement(4,21, Color.YELLOW, true));
        pieces.add(new GridElement(4,22, Color.YELLOW, true));
        pieces.add(new GridElement(5,21, Color.YELLOW, true));
        pieces.add(new GridElement(5,22, Color.YELLOW, true));
        zero = pieces.get(0);
        one = pieces.get(1);
        two = pieces.get(2);
        three = pieces.get(3);
    }
    
    @Override
    public void rotateClockwise() {

    }

    @Override
    public void rotateCounterClockwise() {

    }

    @Override
    protected void rotateClockwiseCase0() {

    }

    @Override
    protected void rotateClockwiseCase1() {

    }

    @Override
    protected void rotateClockwiseCase2() {

    }

    @Override
    protected void rotateClockwiseCase3() {

    }
}
