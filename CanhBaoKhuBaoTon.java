import java.util.*;

class Tram {
    int x, y;

    public Tram(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Tram tram = (Tram) obj;
        return x == tram.x && y == tram.y;
    }

    public int hashCode() {
        return Objects.hash(x, y);
    }
}

public class CanhBaoKhuBaoTon {
    public static List<Tram> timTramCanhBao(List<Tram> danhSachTram) {
        Set<Tram> tramCanhBao = new HashSet<>();

        for (Tram tram : danhSachTram) {
            boolean laTramCanhBao = true;

            for (Tram tramKhac : danhSachTram) {
                if (!tram.equals(tramKhac) && namTrongVungPhuSong(tramKhac, tram)) {
                    laTramCanhBao = false;
                    break;
                }
            }

            if (laTramCanhBao) {
                tramCanhBao.add(tram);
            }
        }

        return new ArrayList<>(tramCanhBao);
    }

    public static boolean namTrongVungPhuSong(Tram tram1, Tram tram2) {
        return (Math.abs(tram1.x - tram2.x) <= 1 && Math.abs(tram1.y - tram2.y) <= 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); // Số lượng trạm
        List<Tram> danhSachTram = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            danhSachTram.add(new Tram(x, y));
        }

        List<Tram> ketQua = timTramCanhBao(danhSachTram);
        
        System.out.println("Output:");
        for (Tram tram : ketQua) {
            System.out.println(tram.x + " " + tram.y);
        }

        scanner.close();
    }
}
