package Es2;

import java.util.Arrays;

public class SimCard {

    //attributi:
    private final String telNumber;
    private int credit;
    private Call last5Calls[];

    //costruttore:
    public SimCard(String telNumber) {
        this.telNumber = telNumber;
        this.credit = 0;
        this.last5Calls = new Call[0];
    }

    //metodi:

    @Override
    public String toString() {
        return "SimCard{" +
                "telNumber='" + telNumber + '\'' +
                ", credit=" + credit +
                ", last5Calls=" + Arrays.toString(last5Calls) +
                '}';
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setLast5Calls(Call[] last5Calls) {
        this.last5Calls = last5Calls;
    }

    public void addCalls(Call call) {
        Call[] nuovoArray = new Call[last5Calls.length + 1];

        for (int i = 0; i < last5Calls.length; i++) {
            nuovoArray[i] = last5Calls[i];
        }

        nuovoArray[last5Calls.length] = call;
        last5Calls = nuovoArray;
    }

}
