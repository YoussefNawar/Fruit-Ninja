package Logic.GameObjects;

import Logic.Mementos.Model;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class FatalBomb extends GameObject {
    public FatalBomb(String st1,String st2) {
        super(st1,st2);
    }

    @Override
    public String getType() {
        return "FatalBomb";
    }

    @Override
    public void slice(Model model, Timeline gameTimeLine) {
        model.setLives(model.getLives()-4);
        this.getCanvas().setDisable(true);
        this.setSliced(true);
    }

    @Override
    public void checkObject(Model model) {

    }

}
