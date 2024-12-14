package org.example;

public class LoadingEffect {
    public static Thread getLoadingThread() {
        return loadingThread;
    }

    private static Thread loadingThread;

    // Hàm bắt đầu hiệu ứng loading
    public static void start() {
        loadingThread = new Thread(() -> {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.print(".");
                    Thread.sleep(500); // Mỗi dấu "." in ra cách nhau 0.5 giây
                }
            } catch (InterruptedException e) {
                // Khi bị ngắt, luồng sẽ dừng
                Thread.currentThread().interrupt();
            }
        });

        // Bắt đầu luồng hiệu ứng
        loadingThread.start();
    }

    // Hàm dừng hiệu ứng loading
    public static void stop() {
        if (loadingThread != null && loadingThread.isAlive()) {
            loadingThread.interrupt(); // Ngắt luồng
            System.out.println(); // Xuống dòng sau khi dừng hiệu ứng
        }
    }
}
