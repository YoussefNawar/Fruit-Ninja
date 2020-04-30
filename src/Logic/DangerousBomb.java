package Logic;

import javafx.animation.Timeline;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.util.Duration;

public class DangerousBomb extends GameObject{
    private boolean isSliced;
    Player p=new Player();


    public DangerousBomb(String st1,String st2) {
        super(st1,st2);
    }

    @Override
    public String getType() {
        return "DangerousBomb";
    }

    @Override
    public void slice(Model model, Timeline gameTimeLine, Duration duration) {
        model.setLives(model.getLives()-1);
    }

}
