package com.example.grocerylist

object ProduktDataManager {

    val products = mutableListOf<Produkt>()


    fun createMockData() {

        products.add(Produkt("Rågmjöl", 12.00, R.drawable.flour))

        products.add(Produkt("Bröd", 18.00, R.drawable.bread))
        products.add(Produkt("Smör", 62.50, R.drawable.butter))
        products.add(Produkt("Ågg", 32.00, R.drawable.eggs))
        products.add(Produkt("Gurka", 8.00, R.drawable.gurka))
        products.add(Produkt("Ost", 72.78, R.drawable.ost))
        products.add(Produkt("Pepperkakskryddor", 12.00, R.drawable.pepperkakskryddor))
        products.add(Produkt("Äpple", 32.00, R.drawable.apple))
        products.add(Produkt("Salt", 17.00, R.drawable.slat))
        products.add(Produkt("Tomat", 5.87, R.drawable.tomat))
        products.add(Produkt("Senap", 5.87, R.drawable.senap))


    }


}