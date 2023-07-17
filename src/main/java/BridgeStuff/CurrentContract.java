package BridgeStuff;

public class CurrentContract {
    private Integer height = null;
    private Suit suit = null;
    private BidType isDoubledOrRedoubled = null;
    private Character player = null;
    public CurrentContract() {

    }
    public CurrentContract(int height, Suit suit, BidType bidType, Character player) {
        if(player != 'E' && player != 'N' && player != 'W' && player != 'S') {
            throw new IllegalArgumentException();
        }
        this.height = height;
        this.suit = suit;
        isDoubledOrRedoubled = bidType;
    }

}
