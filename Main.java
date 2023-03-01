class Main {
    public static void main(String[] args) {
        Clothes clothes = new Clothes();
        Clothing sweater = new Clothing();
        Clothing jeans = new Clothing();
        Clothing shirt = new Clothing();
        clothes.addClothing(sweater);
        clothes.addClothing(jeans);
        clothes.addClothing(shirt);

        for (int lcv = 0; lcv < clothes.getClothesSize(); lcv++) {
            clothes.getItem(lcv).runWasher();
            clothes.getItem(lcv).toString();
            clothes.getItem(lcv).runDryer();
        }
        for (int lcv = 0; lcv < clothes.getClothesSize(); lcv++) {
            System.out.println(clothes.getItem(lcv).toString());
        }
    }
}
