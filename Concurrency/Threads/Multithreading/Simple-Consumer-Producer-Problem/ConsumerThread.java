class ConsumerThread extends Thread {
    private int aValue;
    private Buffer sharedBuffer;
    public ConsumerThread (Buffer buffer)
    {
        sharedBuffer = buffer;
    }
    public void run() {
        for (int count = 0; count < 10; count++) {
            aValue = sharedBuffer.get();
// Now just print out some message.
            System.out.println(aValue + " From: " + getName());
        }
    } // run
} // ConsumerThread