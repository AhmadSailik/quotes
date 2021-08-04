package quotes;

import java.util.Arrays;



    public class Quote {
////////////////////lab08 Start/////////////////

        String[]tags;
        String author;
        String likes;
        String text;

        public Quote(String[]tags,String author,String likes,String text){
            this.tags=tags;
            this.author=author;
            this.likes=likes;
            this.text=text;
        }

        @Override
        public String toString() {
            return "Quote{" +
                    "tags=" + Arrays.toString(tags) +
                    ", author='" + author + '\'' +
                    ", likes='" + likes + '\'' +
                    ", text='" + text + '\'' +
                    '}';
        }

////////////////////lab08 End/////////////////


////////////////////lab09 Start/////////////////

        String quoteText;
        String quoteAuthor;
        String quoteLink;

        public  Quote(String quoteText,String quoteAuthor,String senderLink){
            this.quoteText=quoteText;
            this.quoteAuthor=quoteAuthor;
            this.quoteLink=senderLink;
        }

        public String toStrin2() {
            return "QuoteFromRes{" +
                    "quoteText=" + quoteText +
                    ", quoteAuthor='" + quoteAuthor + '\'' +
                    ", quoteLink='" + quoteLink + '\'' +
                    "}";
        }

////////////////////lab09 End/////////////////

    }


