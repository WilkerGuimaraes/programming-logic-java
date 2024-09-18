import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class CPFFormatter {
    public static String formatarCPF(String numeros) throws ParseException {
        if (numeros.length() != 11) {
            throw new IllegalArgumentException("O CPF deve conter exatamente 11 números.");
        }

        MaskFormatter mascara = new MaskFormatter("###.###.###-##");
        mascara.setValueContainsLiteralCharacters(false);

        return mascara.valueToString(numeros);
    }

    public static void main(String[] args) {
        try {
            String cpfNumeros = "12345678901";

            String cpfFormatado = formatarCPF(cpfNumeros);

            System.out.println("CPF formatado: " + cpfFormatado);
        } catch (ParseException e) {
            System.out.println("Erro ao formatar o CPF: " + e.getMessage());
        }
    }
}
