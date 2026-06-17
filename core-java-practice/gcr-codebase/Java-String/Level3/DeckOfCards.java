import java.util.Scanner;

public class DeckOfCards {
    public static String[] initializeDeck(String[] suits, String[] ranks) {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + " of " + suits[i];
                index++;
            }
        }

        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;

        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }

        return deck;
    }

    public static String[][] distributeCards(String[] deck, int numberOfCards, int numberOfPlayers) {
        if (numberOfCards > deck.length || numberOfCards % numberOfPlayers != 0) {
            return new String[0][0];
        }

        int cardsPerPlayer = numberOfCards / numberOfPlayers;
        String[][] players = new String[numberOfPlayers][cardsPerPlayer];
        int cardIndex = 0;

        for (int i = 0; i < numberOfPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[cardIndex];
                cardIndex++;
            }
        }

        return players;
    }

    public static void displayPlayersCards(String[][] players) {
        if (players.length == 0) {
            System.out.println("Cards cannot be distributed equally.");
            return;
        }

        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + " cards:");

            for (int j = 0; j < players[i].length; j++) {
                System.out.println(players[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        String[] deck = initializeDeck(suits, ranks);
        deck = shuffleDeck(deck);

        System.out.print("Enter number of cards to distribute: ");
        int numberOfCards = input.nextInt();

        System.out.print("Enter number of players: ");
        int numberOfPlayers = input.nextInt();

        String[][] players = distributeCards(deck, numberOfCards, numberOfPlayers);
        displayPlayersCards(players);

        input.close();
    }
}
