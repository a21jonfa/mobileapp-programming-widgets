
# Rapport
Jag skapade en app där man "ratear" bilder. Appen består av en knapp, en imageView, en ratingBar och en textView
![](Screenshot_20240414_223414.png)
när man ratear en bild så visas vilken rating som bilden gets i textViewn.
![](Screenshot_20240414_223510.png)
när man trycker på knappen så visas en random bild i imageView och ratingBar sätts till 0.
![](Screenshot_20240414_223525.png)


Koden fungerar så att varje gång man klickar på knappen adderas i med 1, ratingBaren sätts till 0 och en ny bild visas.
```java
        i = 0;
        button.setOnClickListener(v -> {
            button.setText("Button Clicked " + i + " times");
            i++;
            ratingbar.setRating(0f);
            CycleImage();
        });
        ratingbar.setOnRatingBarChangeListener((ratingBar, rating, fromUser) -> {
            textView.setText("Thanks for giving the picture: " + rating);
        });
```

Bilden visas med hjälp en if sats där en random int genereras och beroende på vilken int som genereras visas en bild.
```java
    private void CycleImage() {
        imageView = findViewById(R.id.imageView);
        Random random = new Random();
        int i = random.nextInt(3);
        if (i == 0)
        imageView.setImageResource(R.drawable.butteryfly_other_side);
        else if (i == 1)
        imageView.setImageResource(R.drawable.butteryfly_side);
        else if (i == 2)
        imageView.setImageResource(R.drawable.butterfly_top);
        }
```