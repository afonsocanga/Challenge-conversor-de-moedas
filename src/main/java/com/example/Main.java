import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Main {
    private static final String API_KEY = "7fe12d7dfd0903e5ddad4e4d";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Conversor de Moedas ===");
        System.out.println("1. USD para EUR");
        System.out.println("2. EUR para USD");
        System.out.println("3. USD para BRL");
        System.out.println("4. BRL para USD");
        System.out.println("5. EUR para BRL");
        System.out.println("6. BRL para EUR");
        System.out.print("Escolha a opção (1-6): ");
        int option = scanner.nextInt();

        System.out.print("Digite o valor a converter: ");
        double amount = scanner.nextDouble();

        String from = "", to = "";

        switch(option) {
            case 1: from = "USD"; to = "EUR"; break;
            case 2: from = "EUR"; to = "USD"; break;
            case 3: from = "USD"; to = "BRL"; break;
            case 4: from = "BRL"; to = "USD"; break;
            case 5: from = "EUR"; to = "BRL"; break;
            case 6: from = "BRL"; to = "EUR"; break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        try {
            String endpoint = String.format(
                "https://v6.exchangerate-api.com/v6/%s/pair/%s/%s",
                API_KEY, from, to
            );
            URL url = new URL(endpoint);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();

            JsonObject json = JsonParser.parseString(content.toString()).getAsJsonObject();
            double rate = json.get("conversion_rate").getAsDouble();
            double result = amount * rate;

            System.out.printf("%.2f %s = %.2f %s\n", amount, from, result, to);

        } catch (Exception e) {
            System.out.println("Erro ao conectar à API: " + e.getMessage());
        }

        scanner.close();
    }
}