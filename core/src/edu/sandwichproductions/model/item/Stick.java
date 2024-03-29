package edu.sandwichproductions.model.item;

import edu.sandwichproductions.util.ItemSprite;

public class Stick extends DamageItem{
    public Stick(int diceAmount){
        super("Stick", 10, 4, diceAmount, 1, ItemSprite.STICK);
    }
    public Stick() {
        super("Stick", 3, 4, 1, 0, ItemSprite.STICK);
        this.itemType = ITEM_TYPE.STICK;
    }
}
