
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paresh
 */
public class Mainclass
{
    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi ap=new TelegramBotsApi();
        try
        {
            ap.registerBot(new Confi());
        }
        catch(Exception e)
        {
        }
}
}