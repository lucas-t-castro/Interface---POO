public class Calculadora extends Operacao_Matematica {

    @Override
    public void soma(double operando1, double operando2){
        System.out.println("Soma: " + operando1 + operando2);
    }
    @Override
    public void subtracao(double operando1, double operando2){
        System.out.println("Subtração:" + (operando1 - operando2));
    }
    Override
    public void multiplicacao(double operando1, double operando2){
        System.out.println("Multiplicação: " + operando1 * operando2);
    }



}
