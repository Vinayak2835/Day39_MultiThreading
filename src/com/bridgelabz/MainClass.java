package com.bridgelabz;

 public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        CharacterThread characterThread = new CharacterThread();//initializing characterThread
        characterThread.start();
        
        NumberThread numThread = new NumberThread();//initializing numberThread
        Thread numberThread = new Thread(numThread);

        numberThread.setDaemon(true);
        numberThread.start();
     }
}
