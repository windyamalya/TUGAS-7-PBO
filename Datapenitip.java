import java.beans.Customizer;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Datapenitip extends Penitip {
    private int no, id;
    private String nama, alamat, jenis, plat;

    @Override
    public void setData() {
        System.out.println("-------------------------------------");
        System.out.println("|      PROGRAM PENITIPAN MOTOR       |");
        System.out.println("---------------------------------------");
        System.out.print("MASUKAN NAMA CUSTOMER        = ");
        this.nama = st.nextLine();
        System.out.print("MASUKAN ALAMAT               = ");
        this.alamat = st.nextLine();
        System.out.print("MASUKAN JENIS MOTOR          = ");
        this.jenis = st.nextLine();
        System.out.print("MASUKAN NO POLISI            = ");
        this.plat = st.nextLine();
        System.out.print("MASUKAN NO HP                = ");
        this.no = in.nextInt();
        System.out.print("MASUKAN NO ANTRIAN PENITIPAN =");
        this.id = in.nextInt();
    }

   @Override
    public void tampilData(){
        try {
            BufferedWriter tulis = new BufferedWriter(new FileWriter("src\\struk.txt"));
            tulis.write("-------------------------------------\n");
            tulis.write("|     STRUK PENGAMBILAN MOTOR        |\n");
            tulis.write("-------------------------------------\n");
            tulis.write(" NAMA CUSTOMER        = " + this.nama+"\n");
            tulis.write(" ALAMAT               = " + this.alamat+"\n");
            tulis.write(" JENIS MOTOR          = " + this.jenis+"\n");
            tulis.write(" NO POLISI            = " + this.plat+"\n");
            tulis.write(" NO HP                = " + this.no+"\n");
            tulis.write(" NO ANTRIAN PENITIPAN =" + this.id+"\n");
            tulis.close();
        }catch (IOException e){
            e.printStackTrace();
        }
   }
    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId() {

    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
}