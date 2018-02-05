import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Scanner;


public class Primary {
    static String ff = "kk.mp4";
    public static void main(String[] args) throws IOException {

        String menu = "1: Start downloading" +
                "\n2: Pause Downloading " +
                "\n3: Resume downloading" +
                "\n4: Cancel Downlaoding" +
                "\n5: Get Progress";
        Scanner scanner = new Scanner(System.in);
        ArrayList<Download> list = new ArrayList<>();
        while (true) {
            System.out.println("Choose an option (0 to display menu)");
            int option = scanner.nextInt();
            Download d = null;
            switch (option) {
                case 0 :
                    System.out.println(menu);
                    break;
                case 1 :
                    d = new Download(new URL(scanner.next()));
                    list.add(d);
                    break;
                case 2 :
                    int x = scanner.nextInt();
                    list.get(x).pause();
                    System.out.println(list.get(x).getProgress());
                    break;
                case 3 :
                    int y = scanner.nextInt();
                    list.get(y).resume();
                    System.out.println(list.get(y).getProgress());
                    break;
                case 4 :
                    list.get(scanner.nextInt()).cancel();
                    break;
                case 5 :
                    System.out.println(list.get(scanner.nextInt()).getProgress());
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
//
//        URL url = new URL("http://192.168.18.2/porn.mp4" + ff);
//        Download d = new Download(url);
//        URLConnection con = url.openConnection();
//        InputStream is = con.getInputStream();
//        File file = new File("/home/vikash/Desktop/"+ff);
//        OutputStream out = new FileOutputStream(file);
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true) {
//                    System.out.println((float)file.length()/(1024 * 1024)+"/"+ (float) con.getContentLength() / (1024 * 1024)+" MB");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//        t.start();
//        byte[] buffer = new byte[4096];
//        int len;
//        while ((len = is.read(buffer)) > 0) {
//            out.write(buffer, 0, len);
//        }
//        System.out.println("Completed");
//        out.close();
//        t.stop();
    }
}