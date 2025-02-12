public class Contar {

    public static void FuncionCuenta (int n){

        if(n <= 0 ){
            return;
        }

        System.out.println(n);
        FuncionCuenta(n-1);

    }

    public static void main(String[] args) {
        
        FuncionCuenta(100);

    }


}