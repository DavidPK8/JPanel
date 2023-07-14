import java.io.*;

public class principal {
    public static void main(String[] args) {
        String filePath = "datos.dat";
        MiClase miObjeto = new MiClase("David", "175180808088", 20);
        try (FileOutputStream fileOut = new FileOutputStream(filePath);
             ObjectOutputStream obOut = new ObjectOutputStream(fileOut);
        ) {
            obOut.writeObject(miObjeto);
            System.out.println("Archivo escrito correctamente");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //////////////////////////////////

        try(
                FileInputStream fileIn = new FileInputStream(filePath);
                ObjectInputStream objIn = new ObjectInputStream(fileIn);
                ){
            MiClase readObject = (MiClase) objIn.readObject();
            System.out.println("El objeto en disco es: " + readObject);
            /*System.out.println(readObject.getEdad());
            System.out.println(readObject.getNombre());*/
        }catch (IOException e){
            throw new RuntimeException();
        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}
