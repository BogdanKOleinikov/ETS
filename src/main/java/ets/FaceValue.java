package ets;

/**
 * FaceValue enumerator
 * @author bogdan oleinikov
 */
public enum FaceValue {
    
    ACE("Ace"),
    TWO("Two"),
    THREE("Three"),
    FOUR("Four"),
    FIVE("Five"),
    SIX("Six"),
    SEVEN("Seven"),
    EIGHT("Eight"),
    NINE("Nine"),
    TEN("Ten"),
    JACK("Jack"),
    QUEEN("Queen"),
    KING("King");
    
    private final String name;
    
    FaceValue(String name){
        this.name = name;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
