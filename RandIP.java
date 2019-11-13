import java.util.*;

public class RandIP {
    public static void main (String[] args) {
        
        packetCapture();
        whiteSpace();
        frameInfo();
        whiteSpace();
        randHex();
    }
    
    public static void frameInfo() {
        
        Random random = new Random();
        int bytes = random.nextInt(100) + 25;
        System.out.println("Frame 1: " + bytes + " on wire (" + (bytes*8) + ") bits, " + bytes + " bytes captures (" + (bytes*8) + " bits) on interface 0");
        System.out.println("Ethernet II, Src: Apple_be:" + (random.nextInt(10) + 1) + (random.nextInt(10) + 1) + ":" + (random.nextInt(10) + 1) + (random.nextInt(10) + 1) + "(20:c9:d0:aa:33:22), Dst: Azurewav_7d:3a:dc (d0:e7:82:aa:22:23)");
        System.out.println("Internet Protocol Version 4, Src: 192.168.1.12, Dst: 192.168.1.6");
        System.out.println("Transmission Control Protocol, Src Port: 53162, Dst Port: 8109, Seq: 1, Ack: 1, Len " + bytes);
        
    }
    
    public static void whiteSpace() {
        System.out.println("\n\n\n\n");
    }
    
    public static void packetCapture() {

        Random rand = new Random();
        int lineNumber = rand.nextInt(70) + 8; // Fake some line numbers for the packet capture
        double base = 0.5148934; // Fake a timestamp; we'll add random quantities to this

        for (int i = 0; i < 7; i++) {
            
            System.out.print(lineNumber + " ");
            lineNumber++;
            
            try {
                Thread.sleep(rand.nextInt(800));
            } catch (Exception e) {
                
            }
            
            base += (Math.random()/8);
            String time = String.format("%.4f", base);
            
            System.out.print(" ");
            
            System.out.print(time + "\t");
            System.out.print("       ");
            System.out.print("192.168.1." + (rand.nextInt(12) + 10) + "\t");
            System.out.print("         ");
            System.out.print("192.168.1." + (rand.nextInt(12) + 10));
            System.out.print("      ");
            
            int size = rand.nextInt(160) + 23;
            String sizeStr = "";
            if (size < 10) {
                sizeStr = "00" + size;
            } else if (size < 100) {
                sizeStr = "0" + size;
            } else {
                sizeStr = "" + size;
            }
            System.out.print("     TCP      " + sizeStr);
            System.out.print("   ");
            System.out.print(rand.nextInt(53000) + 123);
            System.out.print(" ");
            System.out.print("→"); //U+2192
            System.out.print(" ");
            System.out.print(rand.nextInt(53000) + 123);
            System.out.println();
        }

    }
    
    public static void randHex() {
        for (int i = 0; i < 10; i++) {
            System.out.print("00" + i + "0   ");
            oneLine();
            System.out.println();
        }
    }
    
    public static void oneLine() {

        String[] options = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
        Random random = new Random();
        
        for (int i = 0; i < 8; i++) {
            System.out.print("" + options[random.nextInt(16)] + options[random.nextInt(16)] + " ");
        }
        
        System.out.print(" ");

        for (int i = 0; i < 8; i++) {
            System.out.print("" + options[random.nextInt(16)] + options[random.nextInt(16)] + " ");
        }
        
        System.out.print(" ");
        System.out.print(" ");
        System.out.print(" ");
        
        for (int i = 0; i < 8; i++) {
            if (Math.random() > .4) {
                System.out.print(".");
            } else {
                char rando = (char)(random.nextInt(93) + 33);
                System.out.print("" + rando);
            }
        }
        
        System.out.print("  ");

        for (int i = 0; i < 8; i++) {
            if (Math.random() > .4) {
                System.out.print(".");
            } else {
                char rando = (char)(random.nextInt(93) + 23);
                System.out.print("" + rando);
            }
        }        
        
        

    }
}
