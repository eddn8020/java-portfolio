/* Run this file to test the buffer monitor */
class Application {
    public static void main(String[] args) throws Exception {
        // create a buffer monitor
        Buffer buffer = new Buffer();
        // create a producer
        ProducerThread producer = new ProducerThread(buffer);
        //create a consumer
        ConsumerThread consumer = new ConsumerThread(buffer);
        producer.start();
        consumer.start();
    } // main
} // Application