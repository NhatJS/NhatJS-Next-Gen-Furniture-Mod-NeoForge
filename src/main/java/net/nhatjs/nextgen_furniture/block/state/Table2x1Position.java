package net.nhatjs.nextgen_furniture.block.state;

import net.minecraft.util.StringRepresentable;

public enum Table2x1Position implements StringRepresentable {
    CENTER("center"),
    LEFT("left"),
    RIGHT("right");

    private final String name;
    Table2x1Position(String name) {
        this.name = name;
    }
    @Override public String getSerializedName() {
        return name;
    }
}
