class MyThread extends Thread {
        @Override
           public void run() {
                   System.out.println("Поток с использованием наследования запущен");
                   }
                }
                // Подход 2: Реализация интерфейса Runnable
                class MyRunnable implements Runnable {
                       @Override
                          public void run() {
                                   System.out.println("Поток с использованием интерфейса Runnable запущен");
                          }
              }    
                                // Главный класс для запуска потоков
public class Main {
        public static void main(String[] args){
                            // Запуск потока, наследующего Thread
                            MyThread thread1 = new MyThread();
                            thread1.start();
                     // Запуск потока с Runnable 
                            Thread thread2 = new Thread(new MyRunnable());
                            thread2.start();
       }
}
                                                                            