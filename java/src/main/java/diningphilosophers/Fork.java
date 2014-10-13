package diningphilosophers;

import java.util.concurrent.locks.*;

/**
 * Created by raychen on 10/12/14.
 */
public class Fork {
    static int instances = 0;
    private int id;
    ReentrantLock lock;

    public Fork() {
        id = instances++;
        lock = new ReentrantLock();
    }

    public int getId() { return id; }
}
