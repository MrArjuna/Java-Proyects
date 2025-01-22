public class FUNCIONES {

    public static boolean NumeroValido (String telefono) {
        return telefono.matches("\\d{1,11}");
        }
        
        public static void Insertar (){
        System.out.println("Introduce el nombre:");
        String nombre =Agenda.Scan.nextLine();
        
        System.out.println("Introduce el telefono:");
        String telefono = Agenda.Scan.nextLine();
        
        if (!NumeroValido(telefono)){
        System.out.println("Numero con mas de 11 digitos.");
        return;
        }
        
        if (Agenda.contactos.containsKey(nombre)){
            System.out.println("El contacto ya existe");
        }
        else {
            Agenda.contactos.put(nombre,telefono);
            System.out.println("Contacto Añadido");
        }
        
        
        }
        
        public static void Borrar (){
        System.out.println("Introduce el nombre a borrar");
        String nombre = Agenda.Scan.nextLine();
        if (Agenda.contactos.remove(nombre)!=null){
            System.out.println("Contacto exitosamente borrado");
        }
        else {
            System.out.println("El contacto no existe");
            
            }
        
        }
        
        public static void Modificar (){
        System.out.println("Introduce el contacto a modificar");
        
        String nombre = Agenda.Scan.nextLine();
        
        if (Agenda.contactos.containsKey(nombre)){
            System.out.println("Introduce el nuevo numero de telefono");
            
            String Ntelefono = Agenda.Scan.nextLine();
            
            if(!NumeroValido(Ntelefono)){
                
                System.out.println("Telefono Invalido, intenta de nuevo");
                return;
                
                }
            Agenda.contactos.put(nombre,Ntelefono);
            System.out.println("Telefono añadido con exito");
            
            }
            else {
                System.out.println("Numero inexistente");
                }
        
        }

    public static void Buscar  (){
        System.out.println("Introduce el nombre para buscar");
        
        String nombre = Agenda.Scan.nextLine();
        
        
        if (Agenda.contactos.containsKey(nombre)){
            System.out.println(Agenda.contactos.get(nombre));
            }
            else {
                System.out.println("telefono no exuste");
                
                }
        
        }

        public static void MostrarContactos (){
	
            if (Agenda.contactos.isEmpty()){
                System.out.println("Lista vacia");
            }
            else {
                Agenda.contactos.forEach((nombre,telefono) -> System.out.println ("Nombre: " + nombre + " y " + "Telefono: " + telefono));
                        }
        }
        
        

}
