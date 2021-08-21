package io.github.kingpep.urlshortener;
/**

 * encodes and decodes a {@link Url}.

 * <p>

 *
 */
public class Url {

    private static final String allowedString = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private char[] allowedCharacters = allowedString.toCharArray();
    private int base = allowedCharacters.length;

    /**

     * Returns a new {@link String} that has been encoded
     * @param id the {@link Long} id of the url to be encode
       * @return the encoded {@link String}
     */
    public String encode(long id){
        StringBuilder encodedString = new StringBuilder();

        if(id == 0) return String.valueOf(allowedCharacters[0]);

        while (id > 0) {
            encodedString.append(allowedCharacters[(int) (id % base)]);
            id = id / base;
        }

        return encodedString.reverse().toString();
    }
    /**

     * Returns the id {@link Long} of original url that has been encoded
     *  @param input  {@link String} of the encoded string

     * @return the encoded {@link String}

     */
    public long decode(String input) {
         char [] characters = input.toCharArray();
        int length = characters.length;
        int decoded = 0;

        //counter is used to avoid reversing input string
        int counter = 1;
        for (int i = 0; i < length; i++) {
            decoded += allowedString.indexOf(characters[i]) * Math.pow(base, length - counter);
            counter++;
        }
        return decoded;
    }
}