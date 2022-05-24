package uz.pdp.apphrmanagement.main;

public class Pen {
    private boolean button;
    private double inq; // ruchkadagi bor bo'lgan siyoh miqdori
    private String inqColor;
    private double inqConsumption; // bitta harf uchun sarflanadigan siyoh miqdori

    public Pen() {
    }

    public Pen(double inq, String inqColor, double inqConsumption) {
        this.inq = inq;
        this.inqColor = inqColor;
        this.inqConsumption = inqConsumption;
    }

    public Pen(boolean button, double inq, String inqColor, double inqConsumption) {
        this.button = button;
        this.inq = inq;
        this.inqColor = inqColor;
        this.inqConsumption = inqConsumption;
    }

    public void clickButton() {
        button = !button;

    }

    public void write(String word) {
        if (button) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == ' ') {
                    System.out.print(word.charAt(i));
                } else if (Character.isLowerCase(word.charAt(i)) && inq >= inqConsumption) {
                    inq -= inqConsumption;
                    System.out.print(word.charAt(i));
                } else if (Character.isUpperCase(word.charAt(i)) && inq >= 2 * inqConsumption) {
                    inq -= 2 * inqConsumption;
                    System.out.print(word.charAt(i));
                } else {
                    System.out.println("\nRuchkaning siyohi yetmay qoldi, sterjenni almashtirish");
                    break;
                }
            }

        } else {
            System.out.println("Yozishdan oldin tugmani bosing.");
        }
    }

    public void changeSterjen(double inq) {

        this.inq = inq;
    }

    public boolean isButton() {

        return button;
    }

    public void setButton(boolean button) {

        this.button = button;
    }

    public double getInq() {

        return inq;
    }

    public void setInq(double inq) {
        if (inq > 0) {
            this.inq = inq;
        }

    }

    public String getInqColor() {

        return inqColor;
    }

    public void setInqColor(String inqColor) {

        this.inqColor = inqColor;
    }

    public double getInqConsumption() {

        return inqConsumption;
    }

    public void setInqConsumption(double inqConsumption) {
        if (inqConsumption > 0) {
            this.inqConsumption = inqConsumption;
        }
    }
}
