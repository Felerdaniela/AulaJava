
import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.shape.Shape;
import visao.Menu;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2008777
 */
public class Principal {

    public static void main(String[] args) {
//      File arquivo = new File("teste.txt");
//      try{
            // --- LEITURA ---
            //Java 7-
//            int linhaAtual = 0;
//            Scanner entrada = new Scanner(arquivo);
//            while(entrada.hasNextLine()){
//                String linha = entrada.nextLine();
//                linhaAtual++;
//                System.out.println(linha + " : " + linhaAtual);}
            //java 7+
//            Path caminhoArquivo = Paths.get("teste.txt");
//            for(String linha : Files.readAllLines(caminhoArquivo)){
//                System.out.println(linha);
//            }
            
            // --- ESCRITA ---
            
            //Java 7-
//            File caminhoArquivo = new File("teste3.txt");
//            PrintWriter escritor = new PrintWriter(arquivo);
//            escritor.print("ola, ");
//            escritor.print("eu ");
//            escritor.print("sou ");
//            escritor.print("o ");
//            escritor.print("JAVA!");
//            escritor.close();
            //Java 7+
//            Path caminhoArquivo = Paths.get("teste2.txt");
//            ArrayList<String> listaLinhas = new ArrayList();
//            listaLinhas.add("Ola ");
//            listaLinhas.add("Mundo ");
//            listaLinhas.add("CRUEL!");
//            String palavra = "bolinha";
//            Files.write(caminhoArquivo, palavra.getBytes(), StandardOpenOption.APPEND);
            
            
//      }catch(Exception e){
//          System.out.println(e.getMessage());
//      }
        
        
Menu.exibirMenu();        
    }
    
}
