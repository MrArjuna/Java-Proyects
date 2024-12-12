public class Length {

    public static void main (String arg []){
        int aux;
        int [] vec = {3,4,2,2,1,1};


        for (int i= 0; i < vec.length; i++){

            System.out.print(vec[i] + "");
        }

        System.out.println();


        for (int i = 0; i < vec.length; i++){
            for (int J= i + 1; J < vec.length; J++){
                if (vec [J] < vec [i]){ 
                    aux = vec [J];
                    vec [J] = vec [i];
                    vec [i] = aux;
                }
            }
        }

        for (int i= 0; i < vec.length; i++){

            System.out.print(vec[i] + "");
        }


    }

}
