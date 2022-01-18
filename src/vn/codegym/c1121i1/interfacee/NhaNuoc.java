package vn.codegym.c1121i1.interfacee;

public class NhaNuoc {
    public static void main(String[] args) {
        NhaNuoc nhaNuoc = new NhaNuoc();
        CongDan congDan = new CongDan();
        nhaNuoc.capCanCuocCD(congDan);
        System.out.println(congDan);

    }

    public void capCanCuocCD(ICapCanCuocCongDan capCanCuocCongDan) {
        if (capCanCuocCongDan.getGiayGT() == null) {
            throw new IllegalArgumentException("Di ve xin giay gioi thieu tu dia phuong");
        }

        if (capCanCuocCongDan.getSoHoKhau() == null) {
            throw new IllegalArgumentException("Ve nha lay so khau roi len lam");
        }

        System.out.println("Xac Minh So Ho Khau");
        System.out.println("Cap so ho khau hoan thanh");
        capCanCuocCongDan.capCanCuocCDHoanThanh(new CanCuocCD("Dung"));
    }

}
