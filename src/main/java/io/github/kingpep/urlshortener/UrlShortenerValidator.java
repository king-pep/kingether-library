package io.github.kingpep.urlshortener;
import io.github.kingpep.stringpadder.StringPadder;
import org.apache.commons.validator.routines.UrlValidator;

public class UrlShortenerValidator extends UrlValidator{

private UrlShortenerValidator(){

}
    /**

     * Creates an instance of {@link UrlShortenerValidator}.

     *

     * @return the new instance

     */
public static UrlShortenerValidator createUrlShortenerValidator(){
    return new UrlShortenerValidator();
}

}
