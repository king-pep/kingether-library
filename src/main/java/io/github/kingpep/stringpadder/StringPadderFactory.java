package io.github.kingpep.stringpadder;

public final class StringPadderFactory {


    private StringPadderFactory() {

    }


    /**

     * Creates an instance of {@link StringPadder}.

     *

     * @return the new instance

     */

    public static StringPadder createStringPadder() {

        return new StringPadderImpl();

    }


}