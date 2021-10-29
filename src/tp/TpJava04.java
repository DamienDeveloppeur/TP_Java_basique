package tp;

public class TpJava04 {
    private float result;
    public void tp (int amount){
        if(amount < 1000) {
            this.result = amount;
        } else if (amount >= 1000 && amount < 2000) {
            this.result = amount - (amount/100);
        } else if (amount >= 2000 && amount < 5000) {
            this.result = amount - (amount * 3)/100;
        } else {
            this.result = amount - (amount * 5)/100;
        }

        System.out.print(this.result);
    }
    public void tp2(int poid) {

        switch(poid) {
            case 0:
            case 1:
                System.out.print("petit");
                break;
            case 2:
                System.out.print("moyen");
                break;
            case 3:
            default:
                System.out.print("grand");
        }
    }
}
