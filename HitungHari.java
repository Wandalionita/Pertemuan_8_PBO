package tugas_pertemuan_8;

public class HitungHari {
     public static int hitung(int tahun, String bulan) {
        int jumlah_hari;

        if (bulan.equals("Februari")) {
            if ((tahun % 4 == 0) && !(tahun % 100 == 0) || (tahun % 4 == 0)) {
                jumlah_hari = 29;
            } else {
                jumlah_hari = 28;
            }
        } else if (bulan.equals("April") || bulan.equals("Juni") || bulan.equals("September") || bulan.equals("November")) {
            jumlah_hari = 30;
        } else {
            jumlah_hari = 31;
        }

        return jumlah_hari;
    }
}
