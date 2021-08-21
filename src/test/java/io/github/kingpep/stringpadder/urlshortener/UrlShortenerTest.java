package io.github.kingpep.stringpadder.urlshortener;

import io.github.kingpep.urlshortener.Url;
import io.github.kingpep.urlshortener.UrlShortenerValidator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UrlShortenerTest {

    private Url url = new Url();
    private UrlShortenerValidator  urlShortenerValidator = UrlShortenerValidator.createUrlShortenerValidator();


    @Test
    public void encode() {

        String encoded = url.encode(2085);
        System.out.println(encoded);
        //assertThat(encoded).isEqualTo("localhost:8080/a");
//     thegreatapi.com
    }
    @Test
   public void decode() {
        long encoded = url.decode("HN");
        System.out.println(encoded);
        assertThat(encoded).isEqualTo(2085);
//     thegreatapi.com
    }

}
