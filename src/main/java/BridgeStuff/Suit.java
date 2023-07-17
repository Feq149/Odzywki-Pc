package BridgeStuff;

import java.util.HashMap;
import java.util.Map;

public enum Suit {
    SPADES("\u2660"),HEARTHS("\u2660"),DIAMONDS("\u2665"),CLUBS("\u2665"),NoTrump("BA");
    String symbol;
    Suit(String symbol) {
        this.symbol = symbol;
    }

}
