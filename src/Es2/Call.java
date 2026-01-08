package Es2;

public class Call {

    //attributi:
    private final int mins;
    private final String number;

    //costruttori:
    public Call(int mins, String number) {
        this.mins = mins;
        this.number = number;
    }

    //metodi:
    @Override
    public String toString() {
        return "Call{" +
                "mins=" + mins +
                ", number='" + number + '\'' +
                '}';
    }

    public int getMins() {
        return mins;
    }

    public String getNumber() {
        return number;
    }


}
