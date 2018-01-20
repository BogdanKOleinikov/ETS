package ets;

import java.util.Optional;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main application class. Configurable through command line arguments
 * @author bogdan oleinikov
 */
public class InternshipProject {

	/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	//if command line argument is not specified, default  Spring configuration is used. Otherwise specified Spring configuration is used through applied command line argument. 
        ApplicationContext context = new ClassPathXmlApplicationContext(args.length==0?"beans1.xml":args[0]);
        Dealer dealer = (Dealer) context.getBean("dealer");
        dealer.requestNewDeck();
        dealer.shuffle();
        int countCards = dealer.getDeckSize();
        for(int i = 0;i<=countCards;i++){
            Optional<Card> card = dealer.dealOneCard();
            if (card.isPresent()){
                System.out.printf("%d. %s\n",i+1,card.get());
            } else {
                System.out.printf("%d. No more cards remaining.\n",i+1);
            }
        }

    }

}
