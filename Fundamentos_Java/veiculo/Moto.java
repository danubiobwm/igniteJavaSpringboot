package veiculo;

public class Moto implements Veiculo{
    @Override
    public void acelerar() {
        System.out.println("Acelerando o moto");
    }

    @Override
    public void frear() {
        System.out.println("Freado o moto");
    }
}
