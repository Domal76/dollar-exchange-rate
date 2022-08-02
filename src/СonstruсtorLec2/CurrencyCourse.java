package СonstruсtorLec2;

import java.io.IOException;
import java.util.Scanner;

import static СonstruсtorLec2.PageDow.downloadWebPage;
import static СonstruсtorLec2.PageDow.writeToFile;

public class CurrencyCourse {

    CurrencyCourse () throws IOException {
        Scanner scanner = new Scanner(System.in);
        String url1 = "https://www.cbr.ru/currency_base/daily/?UniDbQuery.Posted=True&UniDbQuery.To=";
        System.out.println("Enter the day");
        int day1 = scanner.nextInt();
         System.out.println("Enter the month");
        int month1 = scanner.nextInt();
         System.out.println("Enter the years");
        int years1 = scanner.nextInt();

        Url url2 = new Url(url1, day1, month1, years1);

        String result1 = downloadWebPage(url2.result);    //считывает ссылку с помощью переменной
        int startIndex = result1.lastIndexOf("США" );           //ищем близкие к курсу слова в коде
        int endIndex = result1.lastIndexOf("EUR");
        String str1 = result1.substring(startIndex +22, endIndex-66);       //вычисляяем курс из кода
        System.out.println(str1);
         writeToFile(str1);
    }
}
