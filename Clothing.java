
import java.util.ArrayList;

public class Clothing {
    private boolean isDry;
    private boolean isClean;

    public Clothing() {
        this(true, false);
    }

    public Clothing(boolean dry, boolean clean) {
        isDry = dry;
        isClean = clean;
    }

    public boolean getClean() {
        return isClean;
    }

    public boolean getDry() {
        return isDry;
    }

    public void runWasher() {
        isClean = true;
        isDry = false;
    }

    public void runDryer() {
        isDry = true;
    }

    @Override
    public String toString() {
        String dryNot = " ";
        String cleanNot = " ";
        if (!isDry) {
            dryNot = " not ";
        }
        if (!isClean) {
            cleanNot = " not ";
        }
        return "This item is" + dryNot + "dry and" + cleanNot + "clean!";
    }
}
