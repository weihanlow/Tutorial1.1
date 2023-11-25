public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator(0);

        calc.add(5.2);
        calc.subtract(10);
        calc.multiply(-1);
        calc.divide(2);
        calc.clear();

        int i;
        for(i=0; i<=10; i++){
            calc.add(i);
        }
        for(i=10; i>0; i-=2){
            calc.add(i);
        }
        calc.clear();

        for(i=7; i<=15; i+=2){
            if (i==7){
                calc.add(i);
            } else {
                calc.multiply(i);
            }
        }
        calc.clear();

        for(i=2; i<=100; i+=2){
            if(i%6 == 0){
                continue;
            } else {
                calc.add(i);
            }
        }
    }

}