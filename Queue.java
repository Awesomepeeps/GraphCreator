/* Created by: Nikaansh S.
 * Last Edited: 5/12/23
 * This class has the code for adding and removing items from the queue. It also had a function that returns whether the queue is empty or not
 */

import java.util.ArrayList;

public class Queue {
    
    ArrayList<String> queue = new ArrayList<String>();

    public void endQueue(String s) {
        queue.add(s);
    }

    public String deQueue() {
        String s = queue.get(0);
        queue.remove(0);
        return s;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

}
