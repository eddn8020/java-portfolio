class ProducerThread extends Thread {
    private Buffer sharedBuffer;
    public ProducerThread (Buffer buffer) {
        sharedBuffer = buffer;
    }
    public void run() {
        for (int count = 0; count < 10; count++) {
            sharedBuffer.put(count);
        }
    } // run
} // ProducerThread
