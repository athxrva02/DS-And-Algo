package dsajava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class RandomizedSet {

    private final ArrayList<Integer> list;
    private final Map<Integer, Integer> map;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }

    public boolean search(int val) {
        return map.containsKey(val);
    }

    public void insert(int val) {
        if(search(val)) return;

        list.add(val);
        map.put(val, list.size() - 1);
    }

    public boolean remove(int val) {
        if(!search(val)) return false;

        int index = map.get(val);
        list.set(index, list.get(list.size() - 1));
        map.put(list.get(index), index);
        list.remove(list.size() - 1);
        map.remove(val);

        return true;
    }

    public int getRandom() {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }

    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        obj.insert(1);
        obj.insert(2);
        obj.remove(1);
        int param4 = obj.getRandom();
        System.out.println(param4);
    }
}