package BridgeStuff;

import java.util.Objects;

public final class Call {
    private final BidType typeOfBid;
    private final Integer heigth;
    private final Suit suit;
    public Call() {
        typeOfBid = BidType.Pass;
        heigth = null;
        suit = null;
    }
    public Call(BidType bidType, Integer heigth, Suit suit) {
        typeOfBid = bidType;
        this.heigth = heigth;
        this.suit = suit;
    }
    public Call(BidType bidType) {
        if(bidType == BidType.Contract) {
            throw new IllegalArgumentException();
        }
        this.typeOfBid = bidType;
        this.heigth = null;
        this.suit = null;
    }

    public BidType getTypeOfBid() {
        return typeOfBid;
    }

    public Integer getHeigth() {
        return heigth;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Call bid = (Call) o;
        return typeOfBid == bid.typeOfBid && Objects.equals(heigth, bid.heigth) && suit == bid.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfBid, heigth, suit);
    }

    @Override
    public String toString() {
        if(typeOfBid != BidType.Contract) {
            return typeOfBid.toString();
        }
        return new StringBuilder(heigth).append(suit.symbol).toString();
    }
}
