
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;



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
    public static void main(String[] args) throws TelegramApiException {
//        ApiContextInitializer.init();
        
        TelegramBotsApi ap = new TelegramBotsApi(DefaultBotSession.class);
        try
        {
            ap.registerBot(new Confi());
        }
        catch(Exception e)
        {
        }
}
}