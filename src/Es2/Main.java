package Es2;


public class Main {
    public static void main(String[] args) {
        SimCard sim1 = new SimCard("3470542145");
        SimCard sim2 = new SimCard("3331547896");
        Call call1 = new Call(12, "33452415167");
        Call call2 = new Call(3, "3215645578");
        Call call3 = new Call(1, "3454512542");
        Call call4 = new Call(6, "3454512543");
        Call call5 = new Call(7, "3454512541");
        Call[] callsArray = {call1, call2, call3, call4, call5};

        System.out.println(sim1);
        System.out.println(sim2);
        sim1.setLast5Calls(callsArray);
        System.out.println(sim1);
        System.out.println(sim2);
    }


}
