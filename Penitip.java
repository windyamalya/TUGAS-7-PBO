import java.util.Scanner;

public abstract class Penitip implements Menu {
    @Override
    public abstract void setData();

    @Override
    public abstract void tampilData();
    public final Scanner in = new Scanner(System.in);
    public static Scanner st = new Scanner(System.in);
    }