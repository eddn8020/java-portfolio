class Buffer {
    private int buffer;
    private boolean full;

    public Buffer() {
        full = false; // set the full flag to FALSE initially
    }

    public synchronized int get() {
        while (full == false) {
            try {
                wait(); // if necessary wait for buffer to become full
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        notify(); // notify any waiting producers that buffer is now empty
        full = false;
        return buffer; // return contents of buffer
    } // get

    public synchronized void put(int value) {
        while (full == true) {
// wait for the buffer to become empty
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        buffer = value; // place value in buffer
        full = true;
        notify(); // notify the waiting consumer that
// buffer is now full
    } // put
} // SingleBufferMonitor
