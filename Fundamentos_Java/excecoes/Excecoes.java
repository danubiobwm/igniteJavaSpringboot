package excecoes;

public class Excecoes {
// Checked Exceptions

// UnChecked Exceptions

    public static void main(String[] args) {
        validarNumero();
}
    public static void validarNumero(){
        int numero=10;
        if (numero <100 ){
            try {
                throw new Exception("numero menor que 100");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
