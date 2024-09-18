public class Main {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
        printMegaBytesAndKiloBytes(600);
        printMegaBytesAndKiloBytes(452);
        printMegaBytesAndKiloBytes(-290);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int YY = kiloBytes / 1024;
        int XX = kiloBytes % 1024;
        int zz = kiloBytes;

        if (kiloBytes <= 0) {
            System.out.println("Invalid Value");

        }else{
            System.out.println(zz + " KB " + "= " + YY + " MB " + "and " + XX + " KB");
        }




    }

}
