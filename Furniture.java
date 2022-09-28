class Furniture {
    /**
     * Has all the fields and methods our objects will need
     *
     */

    private final String style;
    private final String name;
    private final int height;
    private final int width;
    private final Material madeFrom;

    public Furniture(String style, String name, int height, int width, Material madeFrom) {
        this.style = style;
        this.name = name;
        this.height = height;
        this.width = width;
        this.madeFrom = madeFrom;
    }

    public int getHeight() {
        return this.height;
    }

    public Material getMade() {
        return this.madeFrom;
    }

    @Override
    public String toString() {
        return "A piece of furniture {" +
                "style ='" + style + '\'' +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", made from=" + madeFrom +
                '}';
    }
}