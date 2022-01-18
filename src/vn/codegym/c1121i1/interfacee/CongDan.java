package vn.codegym.c1121i1.interfacee;

public class CongDan implements ICapCanCuocCongDan {
    CanCuocCD identityCard;

    public void setIdentityCard(CanCuocCD identityCard) {
        this.identityCard = identityCard;
    }

    public CanCuocCD getIdentityCard() {
        return identityCard;
    }

    @Override
    public GiayGT getGiayGT() {
        return new GiayGT();
    }

    @Override
    public SoHK getSoHoKhau() {
        return new SoHK();
    }

    @Override
    public void capCanCuocCDHoanThanh(CanCuocCD canCuocCD) {
        identityCard = canCuocCD;
    }

    @Override
    public String toString() {
        return "CongDan{" +
                "identityCard=" + identityCard +
                '}';
    }
}
