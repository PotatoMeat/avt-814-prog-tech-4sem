import java.awt.*;

class Drone extends Bee{
    Drone(Image img, int x, int y, int id, long timeOfBirth){
        this.img = img;
        this.x = x;
        this.y = y;
        this.id = id;
        this.timeOfBirth = timeOfBirth;
    }
}