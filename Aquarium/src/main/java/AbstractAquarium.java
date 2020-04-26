package EpamAquarium;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractAquarium {
    List<AbstractFish> fishes = new ArrayList<AbstractFish>();


    public void addFish(AbstractFish fish) {
        fishes.add(fish);
    }

    public void removeFish(AbstractFish fish) {
        fishes.remove(fish);
    }

    public void changeFish(AbstractFish fish, String newFish) {
        fishes.set(fishes.indexOf(fish), fish);
    }

    public void printAll() {
        for(AbstractFish fish : fishes) {
            System.out.println(fish);
        }
    }
}
