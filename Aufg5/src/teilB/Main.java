package teilB;

import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        int in1 = System.in.read();
        // Prüfen ob das erste Zeichen ein \\ ist
        if (in1 != '\\') {
            // Falls nicht wird ein Fehler ausgegeben und das Programm abgebrochen
            System.err.println("The first symbol has to be a '\\'!");
            return;
        }
        
        int in2 = System.in.read();
        // Prüfen ob das zweite Zeichen ein u ist.
        if (in2 != 'u') {
            // Falls nicht wird ein Fehler ausgegeben und das Programm abgebrochen
            System.err.println("The second symbol has to be a 'u'!");
            return;
        }
        
        int code = 0;
        
        for (int i = 0; i < 4; i++) {
            
            code *= 16;
            
            int hexInput = System.in.read();
            
            if (hexInput >= 'a' && hexInput <= 'z')
                hexInput += 'A' - 'a';
            
            if (hexInput >= 'A' && hexInput <= 'F') {
                code += hexInput - 'A' + 10;
            } else if (hexInput >= '0' && hexInput <= '9') {
                code += hexInput - '0';
            } else {
                System.err.println("The " + (i + 2) + "symbol has to be a hexadecimal Number!");
                return;
            }
            
        }
        
        int in3 = System.in.read();
        // Prüfen ob das nächste eingegebene Zeichen eine Leertaste, ein Zeilenumbruch (\n) oder
        // ein Enter (\r) ist, um zu schauen ob die Eingabe zu lang ist.
        if (!(in3 == '\r' || in3 == '\n' || in3 == ' ')) {
            // Falls nicht wird ein Fehler ausgegeben und das Programm abgebrochen
            System.err.println("The input has to be exactly 6 symbols long!");
            return;
        }
        
        // Ausgeben der dezimal Zahl und des jeweilige zugehörigen Zeichens
        // Man beachte die Zeichenkodierung der Datei, falls man alle Zeichen im UTF16 Standard ausgeben möchte
        System.out.printf("dec.: " + code + ", char: " + (char) code);
        
    }
    
}
