package org.demo.birds.store;

import org.demo.birds.entities.Bird;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Отнаследоваться от AbstractBirdStore.
 * <p>
 * Реализовать паттерн Singleton.
 */
public class BirdStore extends AbstractBirdStore {

    private static BirdStore instance;

    private Map<String, Bird> birdMap = new HashMap<>();

    public static BirdStore getInstance() {
        if (instance == null) {
            instance = new BirdStore();
        }
        return instance;
    }


    @Override
    public void addBird(Bird b) {
        if (!birdMap.containsKey(b.getName())) {
            birdMap.put(b.getName(), b);
        } else {
            System.out.println("Bird With name " + b.getName() + " already exists." + "\n");
        }
    }

    @Override
    public Bird searchByName(String nameToSearch) {
        if (birdMap.containsKey(nameToSearch)) {
            return birdMap.get(nameToSearch);
        }
        return null;
    }

    @Override
    public List searchByLivingArea(String livingAreaToFind) {
        List listByLivingArea = new ArrayList();
        for (Map.Entry<String, Bird> pair : birdMap.entrySet()) {
            if (pair.getValue().getLivingArea().equals(livingAreaToFind)) {
                listByLivingArea.add(pair.getValue());
            }
        }
        if (listByLivingArea.size() > 0) {
            return listByLivingArea;
        }
        return null;
    }
}
