/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package os.project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import static os.project.floor1.arr;
import static os.project.floor1.enterCar;
import static os.project.floor1.jLabel1;
import static os.project.floor1.jLabel2;
import static os.project.floor1.jLabel21;
import static os.project.floor1.jLabel22;
import static os.project.floor1.jLabel23;
import static os.project.floor1.jLabel3;
import static os.project.floor1.jLabel31;
import static os.project.floor1.jLabel32;
import static os.project.floor1.jLabel33;
import static os.project.floor1.jLabelExit;
import static os.project.floor1.jLabelqueue;
import static os.project.floor1.jLabelstatus;
import static os.project.floor1.mutex;

/**
 *
 * @author sona1_000
 */
public class OSProject {
    
    public static void label33()throws InterruptedException{
        if(arr[0][2]!=0){
            mutex.acquire();updateQueue();
            jLabelstatus.setText("Unpark at B3");
            //synchronized(this){

            final int cc=arr[0][2];
            jLabel33.setIcon(null);
            Timer t1 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/os/project/c2"+arr[0][1]+".png")));
                    arr[0][2]=arr[0][1];
                    jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/os/project/c2"+arr[0][0]+".png")));
                    arr[0][1]=arr[0][0];
                    jLabel31.setIcon(null);
                    arr[0][0]=0;
                    jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/os/project/c2"+cc+".png")));
                    Timer t2 = new Timer(1000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent evt) {
                            jLabel3.setIcon(null);
                            jLabelExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/os/project/c2"+cc+".png")));
                            Timer t3 = new Timer(1000, new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent evt) {
                                    jLabelExit.setIcon(null); 
                                    mutex.release();updateQueue();
                                }
                            });
                            t3.setRepeats(false);
                            t3.start();
                        }
                    });
                    t2.setRepeats(false);
                    t2.start();
                }
            });
            t1.setRepeats(false);
            t1.start();
            arr[0][2]=0;
        }
        //}
    }
    
    public static void label32()throws InterruptedException{
        
        if(arr[0][1]!=0){
            try {
                // TODO add your handling code here:
                mutex.acquire();updateQueue();
                jLabelstatus.setText("Unpark at B2");
                System.out.println("permits : "+mutex.availablePermits());
            } catch (InterruptedException ex) {
                Logger.getLogger(floor1.class.getName()).log(Level.SEVERE, null, ex);
            }
            final int cc=arr[0][1];
            jLabel32.setIcon(null);
            Timer t1 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {                    
                    jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/os/project/c2"+arr[0][0]+".png")));
                    arr[0][1]=arr[0][0];
                    jLabel31.setIcon(null);
                    arr[0][0]=0;
                    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/os/project/c2"+cc+".png")));
                    Timer t2 = new Timer(1000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent evt) {
                            jLabel2.setIcon(null);
                            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/os/project/c2"+cc+".png")));
                            Timer t3 = new Timer(1000, new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent evt) {
                                    jLabel3.setIcon(null);
                                    jLabelExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/os/project/c2"+cc+".png")));
                                    Timer t4 = new Timer(1000, new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent evt) {
                                            jLabelExit.setIcon(null); 
                                            mutex.release();updateQueue();
                                        }
                                    });
                                    t4.setRepeats(false);
                                    t4.start();
                                }
                            });
                            t3.setRepeats(false);
                            t3.start();
                        }
                    });
                    t2.setRepeats(false);
                    t2.start();
                }
            });
            t1.setRepeats(false);
            t1.start();
            arr[0][1]=0;
        }
    }
    
    public static void label31()throws InterruptedException{
        //jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/os/project/c2y.png")));        
        if(arr[0][0]!=0){
            try {
                // TODO add your handling code here:
                mutex.acquire();updateQueue();
                jLabelstatus.setText("Unpark at B1");
                System.out.println("permits : "+mutex.availablePermits());
            } catch (InterruptedException ex) {
                Logger.getLogger(floor1.class.getName()).log(Level.SEVERE, null, ex);
            }
            final int cc=arr[0][0];
            jLabel31.setIcon(null);
            Timer t1 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/os/project/c2"+cc+".png")));
                    Timer t2 = new Timer(1000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent evt) {
                            jLabel1.setIcon(null);
                            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/os/project/c2"+cc+".png")));
                            Timer t3 = new Timer(1000, new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent evt) {
                                    jLabel2.setIcon(null);
                                    jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/os/project/c2"+cc+".png")));
                                    Timer t4 = new Timer(1000, new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent evt) {
                                            jLabel3.setIcon(null);
                                            jLabelExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/os/project/c2"+cc+".png")));
                                            Timer t5 = new Timer(1000, new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent evt) {
                                                    jLabelExit.setIcon(null);
                                                    mutex.release();updateQueue();
                                                }
                                            });
                                            t5.setRepeats(false);
                                            t5.start();
                                        }
                                    });
                                    t4.setRepeats(false);
                                    t4.start();
                                }
                            });
                            t3.setRepeats(false);
                            t3.start();
                        }
                    });
                    t2.setRepeats(false);
                    t2.start();
                }
            });
            t1.setRepeats(false);
            t1.start();
            arr[0][0]=0;
        }
    }
    
    public static void label23()throws InterruptedException{
        
        if(arr[1][2]!=0){
            try {
                // TODO add your handling code here:
                mutex.acquire();updateQueue();
                jLabelstatus.setText("Unpark at A3");
                System.out.println("permits : "+mutex.availablePermits());
            } catch (InterruptedException ex) {
                Logger.getLogger(floor1.class.getName()).log(Level.SEVERE, null, ex);
            }
            final int cc=arr[1][2];
            jLabel23.setIcon(null);
            Timer t1 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/os/project/c2"+arr[1][1]+".png")));
                    arr[1][2]=arr[1][1];
                    jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/os/project/c2"+arr[1][0]+".png")));
                    arr[1][1]=arr[1][0];
                    jLabel21.setIcon(null);
                    arr[1][0]=0;
                    jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/os/project/c2"+cc+".png")));
                    Timer t2 = new Timer(1000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent evt) {
                            jLabel3.setIcon(null);
                            jLabelExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/os/project/c2"+cc+".png")));
                            Timer t3 = new Timer(1000, new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent evt) {
                                    jLabelExit.setIcon(null);  
                                    mutex.release();updateQueue();
                                }
                            });
                            t3.setRepeats(false);
                            t3.start();
                        }
                    });
                    t2.setRepeats(false);
                    t2.start();
                }
            });
            t1.setRepeats(false);
            t1.start();
            arr[1][2]=0;
        }
    }
    
    public static void label22()throws InterruptedException{
        
        if(arr[1][1]!=0){
            try {
                mutex.acquire();updateQueue();
                jLabelstatus.setText("Unpark at A2");
                System.out.println("permits : "+mutex.availablePermits());
            } catch (InterruptedException ex) {
                Logger.getLogger(floor1.class.getName()).log(Level.SEVERE, null, ex);
            }
            final int cc=arr[1][1];
            jLabel22.setIcon(null);
            Timer t1 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/os/project/c2"+arr[1][0]+".png")));
                    arr[1][1]=arr[1][0];
                    jLabel21.setIcon(null);
                    arr[1][0]=0;
                    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/os/project/c2"+cc+".png")));
                    Timer t2 = new Timer(1000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent evt) {
                            jLabel2.setIcon(null);
                            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/os/project/c2"+cc+".png")));
                            Timer t3 = new Timer(1000, new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent evt) {
                                    jLabel3.setIcon(null);
                                    jLabelExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/os/project/c2"+cc+".png")));
                                    Timer t4 = new Timer(1000, new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent evt) {
                                            jLabelExit.setIcon(null);
                                            mutex.release();updateQueue();
                                        }
                                    });
                                    t4.setRepeats(false);
                                    t4.start();
                                }
                            });
                            t3.setRepeats(false);
                            t3.start();
                        }
                    });
                    t2.setRepeats(false);
                    t2.start();
                }
            });
            t1.setRepeats(false);
            t1.start();
            arr[1][1]=0;
        }
    }
    
    public static void label21()throws InterruptedException{
        
        if(arr[1][0]!=0){
            try {
                // TODO add your handling code here:
                mutex.acquire();updateQueue();
                jLabelstatus.setText("Unpark at A1");
                System.out.println("permits : "+mutex.availablePermits());
            } catch (InterruptedException ex) {
                Logger.getLogger(floor1.class.getName()).log(Level.SEVERE, null, ex);
            }
            final int cc=arr[1][0];
            jLabel21.setIcon(null);
            Timer t1 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/os/project/c2"+cc+".png")));
                    Timer t2 = new Timer(1000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent evt) {
                            jLabel1.setIcon(null);
                            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/os/project/c2"+cc+".png")));
                            Timer t3 = new Timer(1000, new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent evt) {
                                    jLabel2.setIcon(null);
                                    jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/os/project/c2"+cc+".png")));
                                    Timer t4 = new Timer(1000, new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent evt) {
                                            jLabel3.setIcon(null);
                                            jLabelExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/os/project/c2"+cc+".png")));
                                            Timer t5 = new Timer(1000, new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent evt) {
                                                    jLabelExit.setIcon(null);
                                                    mutex.release();updateQueue();
                                                }
                                            });
                                            t5.setRepeats(false);
                                            t5.start();
                                        }
                                    });
                                    t4.setRepeats(false);
                                    t4.start();
                                }
                            });
                            t3.setRepeats(false);
                            t3.start();
                        }
                    });
                    t2.setRepeats(false);
                    t2.start();
                }
            });
            t1.setRepeats(false);
            t1.start();
            arr[1][0]=0;
        }
    }
    
    public static void labelEntry()throws InterruptedException{
        try {
            // TODO add your handling code here:
            mutex.acquire();updateQueue();
            System.out.println("permits : "+mutex.availablePermits());
        } catch (InterruptedException ex) {
            Logger.getLogger(floor1.class.getName()).log(Level.SEVERE, null, ex);
        }
        Random rand= new Random();
        int c=(int) (rand.nextInt(6)+1);
        //if(c==0)c=1;
        int flag=0,i,j;
        for(i=2;i>=0;i--)
        {
            for(j=1;j>=0;j--)
            {
                if(arr[j][i]==0)
                {
                    try {
                        enterCar(j,i,c);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(floor1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    arr[j][i]=c;
                    flag=1;
                    break;
                }
            }
            if(flag==1)break;
        }
        if(flag==0){
            System.out.println("Parking Full");
            jLabelstatus.setText("Parking Full");
            mutex.release();updateQueue();
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void updateQueue(){
        jLabelqueue.setText("Queue : "+String.valueOf(mutex.getQueueLength()));
    }
       
}
