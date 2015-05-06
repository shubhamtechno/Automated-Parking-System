/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package os.project;

/**
 *
 * @author sona1_000
 */
public class Mutex {

    private int semaphore;

    public synchronized void Wait() throws InterruptedException {

        if(semaphore < 0) {
            wait();
        }

        semaphore--;

    }

    public synchronized void Post() {

        if(semaphore < 0) {
            semaphore++;
            notify();            
        }
    }
}
