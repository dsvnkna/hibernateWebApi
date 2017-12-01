package database;

import javax.websocket.Session;

public class Description {
    public static void browseDescription (){
        Session newSession = getSessionFactory().openSession();
        Transaction newTransaction = newSession.beginTransaction();
        String text = newSession.find("from WomanSafety.surveys description text");
        System.out.println(text);
        newTransaction.commit();
        newSession.close();
        return;
    }
}
