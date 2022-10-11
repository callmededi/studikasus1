public class Player {
    private int strategi;
    private int skor;

    public Player (int strategi,int skor) {
        strategi = strategi;
        skor = skor;
    }

    public int getStrategi(){
        return strategi;
    }

    public void setStrategi(int strategi) {
        this.strategi = strategi;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }
}
